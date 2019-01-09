package com.tdk.gdxdemo

import com.badlogic.gdx.ApplicationListener
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Pixmap
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.g2d.TextureAtlas
import com.badlogic.gdx.graphics.g2d.TextureRegion
import javax.microedition.khronos.opengles.GL10

/**
 * @Author koridy
 * @Date 2019/1/8-11:33
 * @Email tangdekun0924@gmail.com
 */
class FirstGame : ApplicationListener {

    private lateinit var batch: SpriteBatch
    lateinit var texture: Texture
    lateinit var textureRegion: TextureRegion
    lateinit var sprite:Sprite
    lateinit var pixmap:Pixmap

    override fun render() {
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT)
        Gdx.gl.glClearColor(1f, 1f, 1f, 0f)
        batch.begin()
//        batch.draw(texture, 100f, 200f, 800f, 1280f)
//        batch.draw(textureRegion,0f,0f, 1000f, 500f)
//        sprite.draw(batch)
        batch.draw(texture,100f,100f)
        batch.end()
    }

    override fun pause() {
    }

    override fun resume() {
    }

    override fun resize(p0: Int, p1: Int) {
    }

    override fun create() {
        batch = SpriteBatch()


        texture = Texture(Gdx.files.internal("timg.jpg"))
        textureRegion = TextureRegion(texture,1000,500,-1000,-500)
        sprite  = Sprite(textureRegion)
        sprite.setAlpha(0.5F)
        sprite.setSize(1000f,1000f)
        sprite.setOrigin(sprite.width/2,sprite.height/2)
        sprite.rotation = 180f
        sprite.setPosition(200f,200f)
        sprite.setColor(1f, 0f, 0f, 0.5f)

        pixmap = Pixmap(Gdx.files.internal("timg.jpg"))
        pixmap.setColor(Color.RED)
        pixmap.drawCircle(100,100,100)
        texture = Texture(pixmap)
    }

    override fun dispose() {
        batch.dispose()
        texture.dispose()
    }
}