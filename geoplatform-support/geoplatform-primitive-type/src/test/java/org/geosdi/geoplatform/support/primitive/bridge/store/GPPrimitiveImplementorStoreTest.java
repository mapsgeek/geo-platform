package org.geosdi.geoplatform.support.primitive.bridge.store;

import org.geosdi.geoplatform.support.primitive.bridge.store.bridge.implementor.PrimitiveImplementor;
import org.geosdi.geoplatform.support.primitive.bridge.store.bridge.store.GPPrimitiveImplementorStore;
import org.geosdi.geoplatform.support.primitive.bridge.store.bridge.store.PrimitiveImplementorStore;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;

/**
 * @author Giuseppe La Scaleia - CNR IMAA geoSDI Group
 * @email giuseppe.lascaleia@geosdi.org
 */
public class GPPrimitiveImplementorStoreTest {

    private static final Logger logger = LoggerFactory.getLogger(GPPrimitiveImplementorStoreTest.class);
    //
    private static final PrimitiveImplementorStore<PrimitiveImplementor<?>> primitiveImplementorStore = new GPPrimitiveImplementorStore();

    @Test
    public void loadAllPrimitiveImplementorsTest() throws Exception {
        Set<PrimitiveImplementor<?>> primitiveImplementors = primitiveImplementorStore.getAllImplementors();
        logger.info("##########################PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementors);
    }

    @Test
    public void loadIntegerPrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(Integer.class);
        logger.info("###########################INTEGER_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(int.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(int[].class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Integer.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Integer[].class));
    }

    @Test
    public void loadBigDecimalPrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(BigDecimal.class);
        logger.info("###########################BIG_DECIMAL_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(BigDecimal.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(BigDecimal[].class));
    }

    @Test
    public void loadBigIntegerPrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(BigInteger.class);
        logger.info("###########################BIG_INTEGER_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(BigInteger.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(BigInteger[].class));
    }

    @Test
    public void loadBooleanPrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(Boolean.class);
        logger.info("###########################BOOLEAN_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Boolean.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Boolean[].class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(boolean.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(boolean[].class));
    }

    @Test
    public void loadBytePrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(Byte.class);
        logger.info("###########################BYTE_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Byte.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Byte[].class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(byte.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(byte[].class));
    }

    @Test
    public void loadDoublePrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(Double.class);
        logger.info("###########################DOUBLE_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Double.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Double[].class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(double.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(double[].class));
    }

    @Test
    public void loadFloatPrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(Float.class);
        logger.info("###########################FLOAT_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Float.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Float[].class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(float.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(float[].class));
    }

    @Test
    public void loadLongPrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(Long.class);
        logger.info("###########################LONG_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Long.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Long[].class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(long.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(long[].class));
    }

    @Test
    public void loadNumberPrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(Number.class);
        logger.info("###########################NUMBER_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Number.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Number[].class));
    }

    @Test
    public void loadShortPrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(Short.class);
        logger.info("###########################SHORT_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Short.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Short[].class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(short.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(short[].class));
    }

    @Test
    public void loadCharacterPrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(Character.class);
        logger.info("###########################CHARACTER_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Character.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(Character[].class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(char.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(char[].class));
    }

    @Test
    public void loadStringPrimitiveImplementorTest() throws Exception {
        PrimitiveImplementor primitiveImplementor = primitiveImplementorStore.getPrimitiveImplementorForClass(String.class);
        logger.info("###########################STRING_PRIMITIVE_IMPLEMENTORS : {}\n", primitiveImplementor);
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(String.class));
        Assert.assertTrue(primitiveImplementorStore.isPrimitiveOrWrapper(String[].class));
    }
}
