import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (-1), 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.io.File file4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat0.print(file4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.io.Reader reader3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = cSVFormat0.parse(reader3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode0 = org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY;
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode0 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY + "'", duplicateHeaderMode0.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrailingDelimiter(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.Appendable appendable1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean6 = cSVFormat4.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat.Predefined predefined10 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        java.lang.Object[] objArray11 = new java.lang.Object[] { "", (-1.0d), cSVFormat8, "", predefined10 };
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.printRecord(appendable1, objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + predefined10 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined10.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[, -1.0, Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, , TDF]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[, -1.0, Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, , TDF]");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        java.lang.Class<?> wildcardClass8 = cSVRecordSpliterator7.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        java.nio.file.Path path2 = null;
        java.nio.charset.Charset charset3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter4 = cSVFormat1.print(path2, charset3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        java.lang.String str6 = cSVFormat5.getDelimiterString();
        java.lang.Object obj7 = null;
        boolean boolean8 = cSVFormat5.equals(obj7);
        java.lang.String str9 = cSVFormat5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t" + "'", str6, "\t");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str9, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.csv.QuoteMode quoteMode0 = org.apache.commons.csv.QuoteMode.ALL;
        org.junit.Assert.assertTrue("'" + quoteMode0 + "' != '" + org.apache.commons.csv.QuoteMode.ALL + "'", quoteMode0.equals(org.apache.commons.csv.QuoteMode.ALL));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        boolean boolean6 = cSVFormat5.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean3 = cSVFormat2.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Appendable appendable0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat4.equals(obj6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withHeader(resultSetMetaData8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = new org.apache.commons.csv.CSVPrinter(appendable0, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: appendable");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t" + "'", str5, "\t");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        boolean boolean6 = cSVFormat2.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.ORACLE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) (short) 0, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        java.io.Reader reader7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = cSVFormat5.parse(reader7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        boolean boolean10 = cSVFormat9.isEscapeCharacterSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat9, (long) (short) 10, (long) '\"');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withRecordSeparator("\t");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAutoFlush(true);
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.nio.file.Path path7 = null;
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat3.print(path7, charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        char char3 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withTrailingDelimiter(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        java.nio.file.Path path8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat7.print(path8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setHeader(resultSet5);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setDuplicateHeaderMode(duplicateHeaderMode7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: duplicateHeaderMode");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        java.lang.Class<?> wildcardClass6 = cSVFormat4.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        boolean boolean11 = cSVFormat8.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder1 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4, (long) ' ', (long) '\"');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat6.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean5 = cSVFormat3.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("", cSVFormat7);
        java.lang.String[] strArray9 = cSVFormat7.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray10);
        java.lang.String str13 = cSVFormat3.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\t' + "'", char7 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\N" + "'", str13, "\\N");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuote('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withEscape('\t');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('?')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\t");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray13 = cSVFormat12.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        boolean boolean10 = cSVParser6.hasHeaderComment();
        java.lang.String str11 = cSVParser6.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote((java.lang.Character) '\\');
        char char6 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAllowMissingColumnNames(false);
        boolean boolean9 = cSVFormat8.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\t' + "'", char6 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode0 = org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL;
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode0 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode0.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.lang.String str11 = cSVParser6.getTrailerComment();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser6.getRecords();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream13 = cSVParser6.stream();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser6.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVRecordList12);
        org.junit.Assert.assertNotNull(cSVRecordStream13);
        org.junit.Assert.assertNotNull(cSVRecordList14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        java.lang.String str11 = cSVFormat10.getNullString();
        boolean boolean12 = cSVFormat10.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\N" + "'", str11, "\\N");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setAllowMissingColumnNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setDelimiter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.lang.String str9 = cSVParser6.getTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        java.lang.String str6 = cSVFormat5.getDelimiterString();
        java.lang.Object obj7 = null;
        boolean boolean8 = cSVFormat5.equals(obj7);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat5.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t" + "'", str6, "\t");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowDuplicateHeaderNames();
        boolean boolean2 = cSVFormat1.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreEmptyLines(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat9, (long) (short) 100, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.ORACLE;
        boolean boolean3 = cSVFormat2.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        boolean boolean5 = cSVFormat3.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser6.spliterator();
        java.lang.String str9 = cSVParser6.getTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAutoFlush();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat3.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withEscape('\t');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('?')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("false\t-1.0\tMongoDBTsv\t0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.false?-1.0?MongoDBTsv?0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat3);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withSkipHeaderRecord(false);
        java.lang.String str3 = cSVFormat2.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\\');
        boolean boolean6 = cSVFormat5.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowDuplicateHeaderNames();
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSet4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withEscape((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAutoFlush(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('\\')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        boolean boolean1 = cSVFormat0.getTrailingDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) '\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start and the escape character cannot be the same ('\\')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat7.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        boolean boolean8 = cSVParser6.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat5, (long) '#', (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        boolean boolean9 = cSVFormat8.isCommentMarkerSet();
        boolean boolean10 = cSVFormat8.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean5 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase(false);
        boolean boolean10 = cSVFormat7.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat7.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withQuoteMode(quoteMode11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        char char4 = cSVFormat3.getDelimiter();
        boolean boolean5 = cSVFormat3.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean8 = cSVFormat6.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote((java.lang.Character) '\\');
        boolean boolean12 = cSVFormat3.equals((java.lang.Object) cSVFormat9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withAutoFlush(true);
        java.lang.String[] strArray9 = cSVFormat2.getHeaderComments();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(true);
        java.lang.String str12 = cSVFormat6.getDelimiterString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6, (-1L), (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t" + "'", str12, "\t");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        boolean boolean11 = cSVFormat10.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withHeader(strArray5);
        boolean boolean7 = cSVFormat1.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat5.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        java.lang.Class<?> wildcardClass3 = cSVFormat1.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat4);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setAutoFlush(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setDelimiter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("", cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreHeaderCase(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAllowDuplicateHeaderNames(false);
        java.lang.Character char14 = cSVFormat9.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        java.lang.String str6 = cSVFormat5.getDelimiterString();
        boolean boolean7 = cSVFormat5.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withQuote((java.lang.Character) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t" + "'", str6, "\t");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withNullString(",");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withQuote((java.lang.Character) '|');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("10.0\t");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.10.0?");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        java.lang.String str1 = cSVFormat0.toString();
        org.apache.commons.csv.QuoteMode quoteMode2 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreHeaderCase(true);
        java.lang.Class<?> wildcardClass5 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode2 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode2.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean11 = cSVFormat9.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("", cSVFormat13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat13.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat13.withQuote(' ');
        boolean boolean21 = cSVFormat20.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord();
        java.lang.String[] strArray23 = cSVFormat22.getHeader();
        boolean boolean24 = cSVFormat22.getAllowMissingColumnNames();
        boolean boolean25 = cSVFormat7.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        boolean boolean9 = cSVFormat8.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat5.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        java.lang.String str3 = cSVFormat2.toString();
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat2.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str3, "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        java.lang.String str3 = cSVFormat0.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\N" + "'", str3, "\\N");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) '\"');
        java.io.File file8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat3.print(file8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withNullString(",");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        boolean boolean8 = cSVParser6.hasTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream9 = cSVParser6.stream();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVRecordStream9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.ORACLE;
        boolean boolean3 = cSVFormat2.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrim(true);
        boolean boolean6 = cSVFormat2.isNullStringSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = builder2.build();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder2.setEscape('#');
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder2.setCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setCommentMarker((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        boolean boolean4 = cSVFormat3.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withAutoFlush(true);
        boolean boolean12 = cSVFormat7.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.lang.String[] strArray7 = cSVFormat0.getHeaderComments();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        java.lang.String str6 = cSVFormat5.getDelimiterString();
        java.lang.Object obj7 = null;
        boolean boolean8 = cSVFormat5.equals(obj7);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t" + "'", str6, "\t");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder14 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat3);
        java.io.Reader reader15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = cSVFormat3.parse(reader15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\t' + "'", char7 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.lang.String str7 = cSVFormat0.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        java.nio.file.Path path8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat3.print(path8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAutoFlush();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        boolean boolean6 = cSVFormat3.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withNullString(",");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode2 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuoteMode(quoteMode2);
        boolean boolean4 = cSVFormat3.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + quoteMode2 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode2.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator("false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean5 = cSVFormat4.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote((java.lang.Character) '\\');
        java.nio.file.Path path6 = null;
        java.nio.charset.Charset charset7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat5.print(path6, charset7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean5 = cSVFormat4.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase(false);
        boolean boolean10 = cSVFormat7.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat7.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat2.withQuoteMode(quoteMode11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = builder2.build();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder2.setAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.lang.String str11 = cSVParser6.getTrailerComment();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser6.getRecords();
        java.lang.Class<?> wildcardClass13 = cSVParser6.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVRecordList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<?> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<?> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withAllowDuplicateHeaderNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        java.lang.String[] strArray6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withHeader(strArray6);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode8 = cSVFormat7.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode8 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode8.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<?> SkipHeaderRecord:false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        boolean boolean5 = cSVFormat0.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        java.lang.String[] strArray6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withHeader(strArray6);
        boolean boolean8 = cSVFormat7.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        long long11 = cSVParser6.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        boolean boolean3 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuote((java.lang.Character) '\\');
        java.lang.String str6 = cSVFormat5.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteChar=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str6, "Delimiter=<\t> Escape=<\\> QuoteChar=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withTrim();
        java.lang.String str10 = cSVFormat9.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String[] strArray7 = cSVFormat5.getHeader();
        boolean boolean8 = cSVFormat5.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withRecordSeparator("\\N");
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.io.File file7 = null;
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat6.print(file7, charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        boolean boolean10 = cSVFormat9.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder11 = cSVFormat9.builder();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withSkipHeaderRecord(false);
        boolean boolean14 = cSVFormat13.getAllowMissingColumnNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser6.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat.Predefined predefined1 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) predefined1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter(false);
        java.lang.String str5 = cSVFormat0.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + predefined1 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText + "'", predefined1.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str5, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreEmptyLines(true);
        java.sql.ResultSet resultSet9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withHeader(resultSet9);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '4');
        boolean boolean7 = cSVFormat6.isEscapeCharacterSet();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode8 = cSVFormat6.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode8 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode8.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withRecordSeparator(",");
        boolean boolean9 = cSVFormat8.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.lang.String str11 = cSVParser6.getTrailerComment();
        long long12 = cSVParser6.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.QuoteMode quoteMode9 = cSVFormat6.getQuoteMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + quoteMode9 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode9.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        char char3 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray6 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withHeader(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        java.lang.Character char4 = cSVFormat3.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(char4);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        boolean boolean11 = cSVParser6.isClosed();
        java.lang.String str12 = cSVParser6.getHeaderComment();
        long long13 = cSVParser6.getCurrentLineNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser6.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote((java.lang.Character) '\\');
        char char6 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrim(false);
        java.lang.Character char11 = cSVFormat8.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\t' + "'", char6 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(char11);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        java.lang.String str2 = cSVFormat1.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        boolean boolean5 = cSVFormat3.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote((java.lang.Character) ' ');
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat7.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        boolean boolean8 = cSVParser6.hasTrailerComment();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser6.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('\\');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreEmptyLines(false);
        java.lang.String[] strArray6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withHeader(strArray6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withHeader(resultSetMetaData8);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean5 = cSVFormat3.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSystemRecordSeparator();
        java.lang.String str11 = cSVFormat10.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\N" + "'", str11, "\\N");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("\n");
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode3 = org.apache.commons.csv.DuplicateHeaderMode.DISALLOW;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setDuplicateHeaderMode(duplicateHeaderMode3);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean6 = cSVFormat5.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withIgnoreHeaderCase(false);
        boolean boolean13 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode14 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat5.withQuoteMode(quoteMode14);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder0.setQuoteMode(quoteMode14);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode3 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.DISALLOW + "'", duplicateHeaderMode3.equals(org.apache.commons.csv.DuplicateHeaderMode.DISALLOW));
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + quoteMode14 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode14.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser6.spliterator();
        long long9 = cSVParser6.getRecordNumber();
        boolean boolean10 = cSVParser6.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean11 = cSVFormat9.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withTrailingDelimiter();
        boolean boolean13 = cSVFormat12.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withSkipHeaderRecord();
        char char16 = cSVFormat15.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray19 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat15.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat12.withHeaderComments((java.lang.Object[]) strArray19);
        org.apache.commons.csv.CSVParser cSVParser22 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat21);
        boolean boolean23 = cSVFormat7.equals((java.lang.Object) cSVParser22);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\t' + "'", char16 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVParser22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        boolean boolean6 = cSVFormat2.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        boolean boolean5 = cSVFormat3.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat.Builder builder7 = cSVFormat6.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withHeader(strArray5);
        java.lang.Character char7 = cSVFormat6.getQuoteCharacter();
        boolean boolean8 = cSVFormat6.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(char7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = cSVFormat3.parse(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        boolean boolean6 = cSVFormat5.isEscapeCharacterSet();
        boolean boolean7 = cSVFormat5.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse("", cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: format");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowDuplicateHeaderNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = builder2.build();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder2.setEscape((java.lang.Character) '|');
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder2.setAllowMissingColumnNames(false);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getFirstEndOfLine();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.util.List<java.lang.String> strList10 = cSVParser6.getHeaderNames();
        java.util.Spliterator<java.lang.String> strSpliterator11 = strList10.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strSpliterator11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withRecordSeparator(",");
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        boolean boolean5 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean6 = cSVFormat0.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat4.equals(obj6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat4.withEscape((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat11, (long) '|', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t" + "'", str5, "\t");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        java.lang.String str6 = cSVFormat5.getDelimiterString();
        boolean boolean7 = cSVFormat5.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.QuoteMode quoteMode10 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withQuoteMode(quoteMode10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t" + "'", str6, "\t");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + quoteMode10 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode10.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.nio.file.Path path1 = null;
        java.nio.charset.Charset charset2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter3 = cSVFormat0.print(path1, charset2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("", cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withQuote(' ');
        boolean boolean15 = cSVFormat14.isCommentMarkerSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat5.builder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat5, (long) '#', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean3 = cSVFormat2.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean14 = cSVFormat12.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode17 = cSVFormat16.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder11.setQuoteMode(quoteMode17);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + quoteMode17 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode17.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        boolean boolean3 = cSVFormat1.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowMissingColumnNames(false);
        boolean boolean8 = cSVFormat5.getAutoFlush();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat5, (long) '|', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        java.lang.String[] strArray6 = cSVFormat5.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withTrim();
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        boolean boolean8 = cSVParser6.isClosed();
        boolean boolean9 = cSVParser6.hasHeaderComment();
        cSVParser6.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        java.lang.String[] strArray8 = cSVFormat1.getHeaderComments();
        java.lang.Character char9 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat1.withCommentMarker((java.lang.Character) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNull(char9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(',');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        java.lang.String str11 = cSVFormat10.toString();
        java.lang.String str12 = cSVFormat10.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str11, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\N" + "'", str12, "\\N");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withAllowMissingColumnNames();
        boolean boolean10 = cSVFormat9.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withEscape((java.lang.Character) 'a');
        boolean boolean11 = cSVFormat10.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(false);
        boolean boolean6 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat3.getQuoteMode();
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat3.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + quoteMode7 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode7.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrim(false);
        java.nio.file.Path path3 = null;
        java.nio.charset.Charset charset4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat2.print(path3, charset4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrim(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder15.setEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        boolean boolean7 = cSVParser6.isClosed();
        cSVParser6.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        boolean boolean7 = cSVFormat6.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        java.lang.String[] strArray10 = cSVFormat9.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(true);
        java.lang.String str12 = cSVFormat6.getDelimiterString();
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("\\N", cSVFormat6);
        java.io.File file14 = null;
        java.nio.charset.Charset charset15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat6.print(file14, charset15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t" + "'", str12, "\t");
        org.junit.Assert.assertNotNull(cSVParser13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        java.lang.String str11 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreEmptyLines();
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat12.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t" + "'", str11, "\t");
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        boolean boolean8 = cSVParser6.isClosed();
        boolean boolean9 = cSVParser6.hasHeaderComment();
        java.lang.String str10 = cSVParser6.getFirstEndOfLine();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray19 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat12.withHeader(strArray19);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder11.setHeader(strArray19);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder11.setIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder25 = builder11.setDelimiter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        java.lang.String str9 = cSVFormat8.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Delimiter=<\t> Escape=<4> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str9, "Delimiter=<\t> Escape=<4> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SurroundingSpaces:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        boolean boolean9 = cSVParser6.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        boolean boolean7 = cSVFormat6.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat.Builder builder8 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat6);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setDelimiter('a');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withCommentMarker('\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start and the escape character cannot be the same ('\\')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        char char3 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", cSVFormat12);
        boolean boolean14 = cSVFormat12.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getFirstEndOfLine();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.util.List<java.lang.String> strList10 = cSVParser6.getHeaderNames();
        java.lang.String str11 = cSVParser6.getFirstEndOfLine();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode12 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setQuoteMode(quoteMode12);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + quoteMode12 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode12.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        char char3 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withRecordSeparator(",");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        java.lang.String str1 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withQuote((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.lang.String str10 = cSVParser6.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        boolean boolean5 = cSVFormat1.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withCommentMarker((java.lang.Character) '\"');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter2 = cSVFormat0.printer();
        cSVPrinter2.close();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVPrinter2);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        boolean boolean5 = cSVFormat4.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSkipHeaderRecord();
        char char8 = cSVFormat7.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withHeaderComments((java.lang.Object[]) strArray11);
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat13);
        java.lang.String str15 = cSVParser14.getFirstEndOfLine();
        long long16 = cSVParser14.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\t' + "'", char8 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("\n");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator(",");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setDelimiter("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean8 = cSVFormat7.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat10.printer();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean16 = cSVFormat14.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("", cSVFormat18);
        java.lang.String str20 = cSVParser19.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cSVParser19.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator22 = cSVParser19.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList23 = cSVParser19.getRecords();
        long long24 = cSVParser19.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream25 = cSVParser19.stream();
        cSVPrinter12.printRecord(cSVRecordStream25);
        boolean boolean27 = cSVFormat6.equals((java.lang.Object) cSVPrinter12);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean32 = cSVFormat30.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser35 = org.apache.commons.csv.CSVParser.parse("", cSVFormat34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withIgnoreEmptyLines(true);
        java.lang.String str40 = cSVFormat34.getDelimiterString();
        org.apache.commons.csv.CSVParser cSVParser41 = org.apache.commons.csv.CSVParser.parse("\\N", cSVFormat34);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor42 = cSVParser41.iterator();
        cSVPrinter12.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser41);
        cSVPrinter12.flush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator22);
        org.junit.Assert.assertNotNull(cSVRecordList23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordStream25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVParser35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\t" + "'", str40, "\t");
        org.junit.Assert.assertNotNull(cSVParser41);
        org.junit.Assert.assertNotNull(cSVRecordItor42);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '#');
        boolean boolean8 = cSVFormat7.getTrailingDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setTrailingDelimiter(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setDelimiter("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("", cSVFormat7);
        java.lang.String[] strArray9 = cSVFormat7.getHeader();
        boolean boolean10 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withRecordSeparator("\\N");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        boolean boolean3 = cSVFormat1.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean6 = cSVFormat4.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) '\\');
        boolean boolean10 = cSVFormat1.equals((java.lang.Object) cSVFormat7);
        boolean boolean11 = cSVFormat7.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat7.withQuote((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat7.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowDuplicateHeaderNames();
        java.sql.ResultSet resultSet3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withHeader(resultSet3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withNullString("\\N");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4, (long) (byte) 1, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        boolean boolean6 = cSVFormat4.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat4);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat3);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote((java.lang.Character) '\\');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        java.lang.Class<?> wildcardClass6 = cSVFormat4.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote('a');
        java.io.File file5 = null;
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat0.print(file5, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean8 = cSVFormat7.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat10.printer();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean16 = cSVFormat14.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("", cSVFormat18);
        java.lang.String str20 = cSVParser19.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cSVParser19.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator22 = cSVParser19.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList23 = cSVParser19.getRecords();
        long long24 = cSVParser19.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream25 = cSVParser19.stream();
        cSVPrinter12.printRecord(cSVRecordStream25);
        boolean boolean27 = cSVFormat6.equals((java.lang.Object) cSVPrinter12);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean32 = cSVFormat30.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser35 = org.apache.commons.csv.CSVParser.parse("", cSVFormat34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withIgnoreEmptyLines(true);
        java.lang.String str40 = cSVFormat34.getDelimiterString();
        org.apache.commons.csv.CSVParser cSVParser41 = org.apache.commons.csv.CSVParser.parse("\\N", cSVFormat34);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor42 = cSVParser41.iterator();
        cSVPrinter12.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser41);
        java.lang.Appendable appendable44 = cSVPrinter12.getOut();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator22);
        org.junit.Assert.assertNotNull(cSVRecordList23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordStream25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVParser35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\t" + "'", str40, "\t");
        org.junit.Assert.assertNotNull(cSVParser41);
        org.junit.Assert.assertNotNull(cSVRecordItor42);
        org.junit.Assert.assertNotNull(appendable44);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        cSVParser6.close();
        boolean boolean10 = cSVParser6.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        char char1 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        boolean boolean4 = cSVFormat0.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\t' + "'", char1 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        char char3 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean6 = cSVFormat4.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        boolean boolean9 = cSVFormat0.equals((java.lang.Object) cSVFormat4);
        java.lang.String[] strArray10 = cSVFormat4.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '|' + "'", char3 == '|');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strArray10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withCommentMarker((java.lang.Character) '4');
        boolean boolean10 = cSVFormat7.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.csv.CSVFormat.Predefined predefined1 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined1.getFormat();
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("false\t-1.0\tMongoDBTsv\t0", cSVFormat2);
        org.junit.Assert.assertTrue("'" + predefined1 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined1.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        boolean boolean5 = cSVFormat3.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat10.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVPrinter11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat.Predefined predefined1 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) predefined1);
        org.apache.commons.csv.CSVFormat cSVFormat3 = predefined1.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + predefined1 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText + "'", predefined1.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) '\"');
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = cSVFormat3.parse(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat0.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        boolean boolean9 = cSVFormat8.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withRecordSeparator('a');
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode9 = cSVFormat8.getDuplicateHeaderMode();
        boolean boolean10 = cSVFormat8.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode9 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode9.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote((java.lang.Character) '\\');
        char char6 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrim(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withDelimiter('\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('\\')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\t' + "'", char6 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.lang.String str10 = cSVParser6.getFirstEndOfLine();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser6.getHeaderMap();
        long long12 = cSVParser6.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        char char7 = cSVFormat5.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\t' + "'", char7 == '\t');
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withTrim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getFirstEndOfLine();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream11 = cSVParser6.stream();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNotNull(cSVRecordStream11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat5.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.util.List<java.lang.String> strList11 = cSVParser6.getHeaderNames();
        java.util.Spliterator<java.lang.String> strSpliterator12 = strList11.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator13 = strList11.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strSpliterator12);
        org.junit.Assert.assertNotNull(strSpliterator13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        boolean boolean3 = cSVFormat1.getAllowMissingColumnNames();
        boolean boolean4 = cSVFormat1.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        char char1 = cSVFormat0.getDelimiter();
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSet2);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\t' + "'", char1 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        java.lang.Object obj6 = null;
        boolean boolean7 = cSVFormat4.equals(obj6);
        java.sql.ResultSetMetaData resultSetMetaData8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withHeader(resultSetMetaData8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean12 = cSVFormat10.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode15 = cSVFormat14.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrim();
        boolean boolean17 = cSVFormat4.equals((java.lang.Object) cSVFormat16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser20 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat16, (long) (byte) 0, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\t" + "'", str5, "\t");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + quoteMode15 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode15.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode2 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuoteMode(quoteMode2);
        java.lang.String str4 = cSVFormat0.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + quoteMode2 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode2.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\N" + "'", str4, "\\N");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withNullString(",");
        java.nio.file.Path path15 = null;
        java.nio.charset.Charset charset16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat14.print(path15, charset16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        boolean boolean6 = cSVFormat5.getAllowMissingColumnNames();
        boolean boolean7 = cSVFormat5.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withIgnoreSurroundingSpaces();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder17.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder21.setRecordSeparator('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        boolean boolean6 = cSVFormat3.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withFirstRecordAsHeader();
        boolean boolean8 = cSVFormat7.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray10);
        boolean boolean13 = cSVFormat3.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\t' + "'", char7 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.QuoteMode quoteMode2 = org.apache.commons.csv.QuoteMode.NONE;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuoteMode(quoteMode2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No quotes mode set but no escape character is set");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + quoteMode2 + "' != '" + org.apache.commons.csv.QuoteMode.NONE + "'", quoteMode2.equals(org.apache.commons.csv.QuoteMode.NONE));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowDuplicateHeaderNames(true);
        java.lang.String str12 = cSVFormat9.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withQuote((java.lang.Character) '\t');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('?')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\N" + "'", str12, "\\N");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = builder2.build();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder2.setEscape('#');
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder2.setCommentMarker((java.lang.Character) '\\');
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder2.setHeader(resultSetMetaData10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4, (long) (short) 0, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        boolean boolean5 = cSVFormat1.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = builder4.build();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder4.setCommentMarker((java.lang.Character) '\t');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream9 = cSVParser6.stream();
        java.lang.String str10 = cSVParser6.getTrailerComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser6.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVRecordStream9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.lang.String str7 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withNullString("false,-1.0,MongoDBTsv,0");
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat9);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withAutoFlush(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        boolean boolean6 = cSVFormat3.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("hi!");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('4');
        java.lang.String str9 = cSVFormat6.getNullString();
        java.io.Reader reader10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = cSVFormat6.parse(reader10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\N" + "'", str9, "\\N");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str3 = cSVFormat2.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withRecordSeparator("false\t-1.0\tMongoDBTsv\t0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\N" + "'", str3, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator(' ');
        boolean boolean9 = cSVFormat6.isCommentMarkerSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter('\\');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('\\')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat4.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVPrinter7);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrim(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder15.setNullString(",");
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setNullString("Delimiter=<\t> Escape=<4> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat4);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setDelimiter("hi!");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setHeader(resultSet5);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setQuote((java.lang.Character) '\\');
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder0.setHeader(resultSetMetaData9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean9 = cSVFormat7.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("", cSVFormat11);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor13 = cSVParser12.iterator();
        boolean boolean14 = cSVParser12.isClosed();
        java.util.List<java.lang.String> strList15 = cSVParser12.getHeaderNames();
        boolean boolean16 = cSVParser12.hasHeaderComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream17 = cSVParser12.stream();
        cSVPrinter5.printRecords(cSVRecordStream17);
        cSVPrinter5.println();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVPrinter5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertNotNull(cSVRecordItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVRecordStream17);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat20 = builder17.build();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        boolean boolean9 = cSVFormat8.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.lang.String str11 = cSVParser6.getTrailerComment();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser6.getRecords();
        boolean boolean13 = cSVParser6.hasHeaderComment();
        boolean boolean14 = cSVParser6.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVRecordList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        boolean boolean11 = cSVParser6.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('4');
        java.lang.String str9 = cSVFormat6.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreHeaderCase(false);
        boolean boolean12 = cSVFormat11.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\N" + "'", str9, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        boolean boolean11 = cSVParser6.isClosed();
        java.lang.String str12 = cSVParser6.getHeaderComment();
        long long13 = cSVParser6.getCurrentLineNumber();
        long long14 = cSVParser6.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAutoFlush(true);
        java.lang.String[] strArray8 = cSVFormat1.getHeaderComments();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withHeader(strArray5);
        java.lang.String str7 = cSVFormat1.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t" + "'", str7, "\t");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        java.lang.String str1 = cSVFormat0.toString();
        org.apache.commons.csv.QuoteMode quoteMode2 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + quoteMode2 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode2.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat0.printer();
        cSVPrinter7.close(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVPrinter7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        boolean boolean5 = cSVFormat3.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote((java.lang.Character) '\t');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same ('?')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        boolean boolean7 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        boolean boolean6 = cSVFormat3.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.getIgnoreSurroundingSpaces();
        boolean boolean14 = cSVFormat12.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("", cSVFormat7);
        java.lang.String[] strArray9 = cSVFormat7.getHeader();
        boolean boolean10 = cSVFormat7.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withRecordSeparator("\\N");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        boolean boolean5 = cSVFormat1.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withRecordSeparator("");
        java.io.Reader reader8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = cSVFormat7.parse(reader8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = builder4.build();
        org.apache.commons.csv.CSVFormat cSVFormat8 = builder4.build();
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder4.setQuote((java.lang.Character) '\\');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        boolean boolean8 = cSVParser6.isClosed();
        boolean boolean9 = cSVParser6.hasHeaderComment();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor10 = cSVParser6.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor10);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getFirstEndOfLine();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        boolean boolean7 = cSVParser6.isClosed();
        long long8 = cSVParser6.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        boolean boolean2 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames(false);
        boolean boolean7 = cSVFormat4.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) '\\');
        java.lang.String[] strArray6 = cSVFormat5.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        java.lang.Class<?> wildcardClass4 = cSVFormat3.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(true);
        boolean boolean6 = cSVFormat5.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean8 = cSVFormat7.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat10.printer();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean16 = cSVFormat14.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("", cSVFormat18);
        java.lang.String str20 = cSVParser19.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cSVParser19.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator22 = cSVParser19.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList23 = cSVParser19.getRecords();
        long long24 = cSVParser19.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream25 = cSVParser19.stream();
        cSVPrinter12.printRecord(cSVRecordStream25);
        boolean boolean27 = cSVFormat6.equals((java.lang.Object) cSVPrinter12);
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean30 = cSVFormat28.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat28.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat28.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat28.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData35 = null;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withHeader(resultSetMetaData35);
        org.apache.commons.csv.CSVFormat.Builder builder37 = cSVFormat34.builder();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder39.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat42 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean44 = cSVFormat42.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined47 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray49 = new java.lang.Object[] { false, (-1.0d), predefined47, (short) 0 };
        java.lang.String str50 = cSVFormat42.format(objArray49);
        org.apache.commons.csv.CSVFormat.Builder builder51 = cSVFormat42.builder();
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder51.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat54 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat54.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray61 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat62 = cSVFormat54.withHeader(strArray61);
        org.apache.commons.csv.CSVFormat.Builder builder63 = builder53.setHeader(strArray61);
        org.apache.commons.csv.CSVFormat.Builder builder64 = builder41.setHeaderComments(strArray61);
        cSVPrinter12.print((java.lang.Object) builder64);
        org.apache.commons.csv.CSVFormat.Builder builder67 = builder64.setTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator22);
        org.junit.Assert.assertNotNull(cSVRecordList23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordStream25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + predefined47 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined47.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str50, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(cSVFormat62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.lang.String str11 = cSVParser6.getHeaderComment();
        java.lang.String str12 = cSVParser6.getFirstEndOfLine();
        boolean boolean13 = cSVParser6.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        char char3 = cSVFormat2.getDelimiter();
        boolean boolean4 = cSVFormat2.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean7 = cSVFormat5.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote((java.lang.Character) '\\');
        boolean boolean11 = cSVFormat2.equals((java.lang.Object) cSVFormat8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat8, (long) '4', (long) ',');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + '\t' + "'", char3 == '\t');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\\N");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.\\N");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat9.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVPrinter10);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuote((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(false);
        boolean boolean6 = cSVFormat3.getIgnoreEmptyLines();
        org.apache.commons.csv.QuoteMode quoteMode7 = cSVFormat3.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withRecordSeparator(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + quoteMode7 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode7.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean5 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(false);
        java.lang.Character char8 = cSVFormat7.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(char8);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        boolean boolean3 = cSVFormat2.getAutoFlush();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        boolean boolean6 = cSVFormat5.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrim(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteChar=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.lang.String str10 = cSVParser6.getFirstEndOfLine();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser6.getHeaderMap();
        cSVParser6.close();
        boolean boolean13 = cSVParser6.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean3 = cSVFormat2.getIgnoreHeaderCase();
        boolean boolean4 = cSVFormat2.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord();
        java.lang.String[] strArray15 = cSVFormat14.getHeader();
        boolean boolean16 = cSVFormat14.getAllowMissingColumnNames();
        java.lang.String str17 = cSVFormat14.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteChar=< > QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true" + "'", str17, "Delimiter=<\t> Escape=<\\> QuoteChar=< > QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:true");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withEscape((java.lang.Character) '|');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVPrinter7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        java.sql.ResultSet resultSet14 = null;
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setHeader(resultSet14);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray7 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withHeader(strArray7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat0.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withCommentMarker((java.lang.Character) '\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        boolean boolean7 = cSVFormat4.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        boolean boolean10 = cSVParser6.hasHeaderComment();
        boolean boolean11 = cSVParser6.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        boolean boolean7 = cSVFormat0.isNullStringSet();
        boolean boolean8 = cSVFormat0.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setIgnoreHeaderCase(false);
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setHeader(resultSet5);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setQuote(' ');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setQuote('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined6 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray8 = new java.lang.Object[] { false, (-1.0d), predefined6, (short) 0 };
        java.lang.String str9 = cSVFormat1.format(objArray8);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + predefined6 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined6.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str9, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter2 = cSVFormat0.printer();
        java.lang.Class<?> wildcardClass3 = cSVPrinter2.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVPrinter2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean6 = cSVFormat4.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat4.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat4.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSetMetaData11);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode17 = cSVFormat12.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder3.setDuplicateHeaderMode(duplicateHeaderMode17);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode17 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode17.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream9 = cSVParser6.stream();
        java.lang.String str10 = cSVParser6.getTrailerComment();
        cSVParser6.close();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVRecordStream9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        boolean boolean11 = cSVParser6.isClosed();
        java.lang.String str12 = cSVParser6.getHeaderComment();
        long long13 = cSVParser6.getCurrentLineNumber();
        boolean boolean14 = cSVParser6.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getFirstEndOfLine();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.lang.String str10 = cSVParser6.getFirstEndOfLine();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator11 = cSVParser6.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator11);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder0.setHeaderComments(strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder16.setTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\t' + "'", char10 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote((java.lang.Character) '\\');
        char char6 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAllowMissingColumnNames(false);
        boolean boolean9 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\t' + "'", char6 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator(' ');
        boolean boolean9 = cSVFormat6.isCommentMarkerSet();
        org.apache.commons.csv.QuoteMode quoteMode10 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withQuoteMode(quoteMode10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + quoteMode10 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode10.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator8 = cSVParser6.spliterator();
        long long9 = cSVParser6.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat.Builder builder11 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = builder13.build();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withQuote('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        java.io.Reader reader11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = cSVFormat10.parse(reader11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse("", cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(false);
        boolean boolean11 = cSVFormat10.isEscapeCharacterSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVParser8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker((java.lang.Character) ' ');
        java.lang.String str11 = cSVFormat10.toString();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withRecordSeparator("#\t\thi!\t#n\t#n");
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str11, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat5.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        boolean boolean4 = cSVFormat2.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withEscape('\t');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('?')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) '\\');
        char char8 = cSVFormat5.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\t' + "'", char8 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MySQL + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MySQL));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        boolean boolean5 = cSVFormat4.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withSkipHeaderRecord();
        char char8 = cSVFormat7.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray11 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withHeader(strArray11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat4.withHeaderComments((java.lang.Object[]) strArray11);
        org.apache.commons.csv.CSVParser cSVParser14 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat13);
        java.lang.String str15 = cSVParser14.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\t' + "'", char8 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVParser14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean9 = cSVFormat7.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined12 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray14 = new java.lang.Object[] { false, (-1.0d), predefined12, (short) 0 };
        java.lang.String str15 = cSVFormat7.format(objArray14);
        org.apache.commons.csv.CSVFormat.Builder builder16 = cSVFormat7.builder();
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray26 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat19.withHeader(strArray26);
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder18.setHeader(strArray26);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean30 = cSVFormat29.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode31 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat29.withQuoteMode(quoteMode31);
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder18.setQuoteMode(quoteMode31);
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder4.setQuoteMode(quoteMode31);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + predefined12 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined12.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str15, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + quoteMode31 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode31.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote((java.lang.Character) '\\');
        boolean boolean6 = cSVFormat5.isQuoteCharacterSet();
        boolean boolean7 = cSVFormat5.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray7 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withHeader(strArray7);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeader(resultSetMetaData9);
        boolean boolean11 = cSVFormat0.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withTrim();
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withAutoFlush(false);
        boolean boolean11 = cSVFormat10.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        boolean boolean9 = cSVFormat6.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        long long11 = cSVParser6.getCurrentLineNumber();
        java.util.List<java.lang.String> strList12 = cSVParser6.getHeaderNames();
        java.util.Spliterator<java.lang.String> strSpliterator13 = strList12.spliterator();
        java.lang.Class<?> wildcardClass14 = strSpliterator13.getClass();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        java.lang.String str1 = cSVFormat0.toString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str1, "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat4);
        boolean boolean6 = cSVFormat4.isNullStringSet();
        org.apache.commons.csv.CSVFormat.Builder builder7 = cSVFormat4.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrim(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        java.lang.Class<?> wildcardClass6 = cSVFormat3.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withTrim(false);
        boolean boolean10 = cSVFormat3.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreHeaderCase(false);
        boolean boolean8 = cSVFormat7.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        boolean boolean9 = cSVFormat3.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withNullString("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode2 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuoteMode(quoteMode2);
        java.lang.String str4 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withRecordSeparator('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat12.printer();
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean18 = cSVFormat16.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser21 = org.apache.commons.csv.CSVParser.parse("", cSVFormat20);
        java.lang.String str22 = cSVParser21.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap23 = cSVParser21.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator24 = cSVParser21.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList25 = cSVParser21.getRecords();
        long long26 = cSVParser21.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream27 = cSVParser21.stream();
        cSVPrinter14.printRecord(cSVRecordStream27);
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter8.printRecords(cSVRecordStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + quoteMode2 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode2.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVPrinter14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVParser21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(strMap23);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator24);
        org.junit.Assert.assertNotNull(cSVRecordList25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordStream27);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        boolean boolean3 = cSVFormat2.isEscapeCharacterSet();
        java.io.File file4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat2.print(file4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean16 = cSVFormat14.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined19 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray21 = new java.lang.Object[] { false, (-1.0d), predefined19, (short) 0 };
        java.lang.String str22 = cSVFormat14.format(objArray21);
        org.apache.commons.csv.CSVFormat.Builder builder23 = cSVFormat14.builder();
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray33 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat26.withHeader(strArray33);
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder25.setHeader(strArray33);
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder13.setHeaderComments(strArray33);
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder36.setDelimiter('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + predefined19 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined19.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str22, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean5 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        java.util.List<java.lang.String> strList11 = cSVParser6.getHeaderNames();
        long long12 = cSVParser6.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.io.Reader reader13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser14 = cSVFormat12.parse(reader13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setTrim(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setAutoFlush(true);
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder19.setTrim(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder19.setAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withQuote((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        long long8 = cSVParser6.getCurrentLineNumber();
        long long9 = cSVParser6.getRecordNumber();
        boolean boolean10 = cSVParser6.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withEscape((java.lang.Character) '4');
        java.lang.String str7 = cSVFormat4.getNullString();
        char char8 = cSVFormat4.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\N" + "'", str7, "\\N");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\t' + "'", char8 == '\t');
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withQuote('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean5 = cSVFormat3.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withTrailingDelimiter();
        boolean boolean7 = cSVFormat6.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSkipHeaderRecord();
        char char10 = cSVFormat9.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray13 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat9.withHeader(strArray13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder0.setHeaderComments(strArray13);
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder0.setRecordSeparator("false\t-1.0\tMongoDBTsv\t0");
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder0.setIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setRecordSeparator('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\t' + "'", char10 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setCommentMarker((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setEscape(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str2 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withQuote('\\');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\N" + "'", str2, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(true);
        boolean boolean9 = cSVFormat8.getIgnoreSurroundingSpaces();
        java.lang.String str10 = cSVFormat8.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\N" + "'", str10, "\\N");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        char char1 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) ',');
        boolean boolean4 = cSVFormat3.isEscapeCharacterSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withEscape((java.lang.Character) '\t');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same ('?')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\t' + "'", char1 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.lang.String str7 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withNullString("false,-1.0,MongoDBTsv,0");
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withRecordSeparator('|');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowDuplicateHeaderNames();
        java.lang.Appendable appendable13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean16 = cSVFormat14.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withTrailingDelimiter();
        java.lang.String str18 = cSVFormat17.getDelimiterString();
        java.lang.Object obj19 = null;
        boolean boolean20 = cSVFormat17.equals(obj19);
        java.lang.String str21 = cSVFormat17.toString();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat17.withNullString("false,-1.0,MongoDBTsv,0");
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withRecordSeparator('|');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean27 = cSVFormat26.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter31 = cSVFormat29.printer();
        java.lang.Appendable appendable32 = cSVPrinter31.getOut();
        org.apache.commons.csv.CSVFormat cSVFormat33 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean35 = cSVFormat33.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat42.withRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat42.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat47 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean49 = cSVFormat47.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat47.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat51 = cSVFormat47.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat47.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData54 = null;
        org.apache.commons.csv.CSVFormat cSVFormat55 = cSVFormat53.withHeader(resultSetMetaData54);
        org.apache.commons.csv.CSVFormat.Builder builder56 = cSVFormat53.builder();
        org.apache.commons.csv.CSVFormat.Builder builder58 = builder56.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder58.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat cSVFormat61 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean63 = cSVFormat61.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined66 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray68 = new java.lang.Object[] { false, (-1.0d), predefined66, (short) 0 };
        java.lang.String str69 = cSVFormat61.format(objArray68);
        org.apache.commons.csv.CSVFormat.Builder builder70 = cSVFormat61.builder();
        org.apache.commons.csv.CSVFormat.Builder builder72 = builder70.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat73 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat75 = cSVFormat73.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray80 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat81 = cSVFormat73.withHeader(strArray80);
        org.apache.commons.csv.CSVFormat.Builder builder82 = builder72.setHeader(strArray80);
        org.apache.commons.csv.CSVFormat.Builder builder83 = builder60.setHeaderComments(strArray80);
        java.lang.String str84 = cSVFormat46.format((java.lang.Object[]) strArray80);
        cSVFormat23.printRecord(appendable32, (java.lang.Object[]) strArray80);
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat12.printRecord(appendable13, (java.lang.Object[]) strArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\t" + "'", str18, "\t");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str21, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVPrinter31);
        org.junit.Assert.assertNotNull(appendable32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(cSVFormat55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + predefined66 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined66.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str69, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(cSVFormat73);
        org.junit.Assert.assertNotNull(cSVFormat75);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(cSVFormat81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\\\t\thi!\t\\n\t\\n\t" + "'", str84, "\\\t\thi!\t\\n\t\\n\t");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder13 = cSVFormat3.builder();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        boolean boolean4 = cSVFormat3.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withSystemRecordSeparator();
        boolean boolean10 = cSVFormat9.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("false,-1.0,MongoDBTsv,0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.false,-1.0,MongoDBTsv,0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        char char1 = cSVFormat0.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\t' + "'", char1 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreHeaderCase();
        boolean boolean16 = cSVFormat12.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        java.lang.String str11 = cSVFormat10.getNullString();
        java.nio.file.Path path12 = null;
        java.nio.charset.Charset charset13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat10.print(path12, charset13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\N" + "'", str11, "\\N");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withHeader(resultSetMetaData5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withEscape((java.lang.Character) '4');
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote((java.lang.Character) '\\');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.Character char13 = cSVFormat12.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(char13);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean9 = cSVFormat7.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("", cSVFormat11);
        java.lang.String str13 = cSVParser12.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser12.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator15 = cSVParser12.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList16 = cSVParser12.getRecords();
        long long17 = cSVParser12.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream18 = cSVParser12.stream();
        cSVPrinter5.printRecord(cSVRecordStream18);
        cSVPrinter5.println();
        cSVPrinter5.println();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVPrinter5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator15);
        org.junit.Assert.assertNotNull(cSVRecordList16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordStream18);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getFirstEndOfLine();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.util.List<java.lang.String> strList10 = cSVParser6.getHeaderNames();
        long long11 = cSVParser6.getRecordNumber();
        java.lang.String str12 = cSVParser6.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat12.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withTrim();
        boolean boolean17 = cSVFormat12.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        java.lang.String[] strArray7 = new java.lang.String[] { "\t", "hi!", "\n", "\n" };
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withHeader(strArray7);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeader(resultSetMetaData9);
        boolean boolean11 = cSVFormat0.isNullStringSet();
        boolean boolean12 = cSVFormat0.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        boolean boolean3 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean4 = cSVFormat0.isCommentMarkerSet();
        boolean boolean5 = cSVFormat0.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> CommentStart=< > NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        boolean boolean10 = cSVFormat9.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        boolean boolean3 = cSVFormat0.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        java.lang.String str1 = cSVFormat0.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withRecordSeparator("false\t-1.0\tMongoDBTsv\t0");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("\\\t\thi!\t\\n\t\\n");
        boolean boolean8 = cSVFormat7.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\N" + "'", str1, "\\N");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        cSVParser6.close();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream10 = cSVParser6.stream();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordStream10);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat0.builder();
        java.lang.String[] strArray16 = new java.lang.String[] { "false\t-1.0\tMongoDBTsv\t0", "\n", "Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false", "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false", "false,-1.0,MongoDBTsv,0", "" };
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder9.setHeaderComments(strArray16);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder17.setNullString(",");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat.Builder builder5 = cSVFormat4.builder();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setQuote((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setDelimiter("Delimiter=<,> QuoteChar=<\"> RecordSeparator=<\r\n> SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        cSVParser6.close();
        java.util.Map<java.lang.String, java.lang.Integer> strMap11 = cSVParser6.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(strMap11);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withCommentMarker((java.lang.Character) ' ');
        java.lang.String str11 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat0.withIgnoreEmptyLines();
        boolean boolean13 = cSVFormat12.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t" + "'", str11, "\t");
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        boolean boolean8 = cSVParser6.isClosed();
        boolean boolean9 = cSVParser6.hasHeaderComment();
        long long10 = cSVParser6.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withHeader(resultSetMetaData13);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat.Predefined predefined5 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        java.lang.Object[] objArray7 = new java.lang.Object[] { false, (-1.0d), predefined5, (short) 0 };
        java.lang.String str8 = cSVFormat0.format(objArray7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + predefined5 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined5.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[false, -1.0, MongoDBTsv, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "false\t-1.0\tMongoDBTsv\t0" + "'", str8, "false\t-1.0\tMongoDBTsv\t0");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withRecordSeparator("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        boolean boolean15 = cSVFormat14.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withRecordSeparator(',');
        java.lang.String str8 = cSVFormat3.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\t" + "'", str8, "\t");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        java.lang.String str7 = cSVFormat0.toString();
        boolean boolean8 = cSVFormat0.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str7, "Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean3 = cSVFormat2.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode4 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withQuoteMode(quoteMode4);
        java.lang.String str6 = cSVFormat2.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withTrim();
        java.lang.String str8 = cSVFormat7.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreEmptyLines(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\t" + "'", str6, "\t");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames(true);
        boolean boolean5 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        java.lang.String str8 = cSVFormat7.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAutoFlush(true);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat6.builder();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setEscape((java.lang.Character) '|');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setQuote((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.util.List<java.lang.String> strList11 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser6.spliterator();
        boolean boolean13 = cSVParser6.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat11);
        java.sql.ResultSetMetaData resultSetMetaData13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(resultSetMetaData13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat11.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withQuote((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser18 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream8 = cSVParser6.stream();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        long long11 = cSVParser6.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNotNull(cSVRecordStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('\\');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote((java.lang.Character) '\\');
        char char6 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\t' + "'", char6 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean4 = cSVFormat2.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withIgnoreEmptyLines(true);
        java.lang.String str12 = cSVFormat6.getDelimiterString();
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("\\N", cSVFormat6);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor14 = cSVParser13.iterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList15 = cSVParser13.getRecords();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream16 = cSVParser13.stream();
        long long17 = cSVParser13.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\t" + "'", str12, "\t");
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVRecordItor14);
        org.junit.Assert.assertNotNull(cSVRecordList15);
        org.junit.Assert.assertNotNull(cSVRecordStream16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        java.lang.String str8 = cSVParser6.getTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean11 = cSVFormat9.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAllowMissingColumnNames();
        org.apache.commons.csv.QuoteMode quoteMode14 = cSVFormat13.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withTrim();
        boolean boolean16 = cSVFormat3.equals((java.lang.Object) cSVFormat15);
        boolean boolean17 = cSVFormat15.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat15.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + quoteMode14 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode14.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(cSVFormat19);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withSkipHeaderRecord();
        boolean boolean5 = cSVFormat0.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote((java.lang.Character) '\\');
        char char6 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\t' + "'", char6 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('4');
        java.lang.String[] strArray11 = cSVFormat10.getHeaderComments();
        boolean boolean12 = cSVFormat10.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreSurroundingSpaces(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withQuote('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        java.lang.String str3 = cSVFormat2.toString();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str3, "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        boolean boolean5 = cSVFormat4.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.commons.csv.CSVFormat.Builder builder1 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder3 = builder1.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder5 = builder3.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = builder5.build();
        org.apache.commons.csv.CSVFormat cSVFormat9 = builder5.build();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse("", cSVFormat10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVParser11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        boolean boolean13 = cSVFormat12.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord();
        boolean boolean15 = cSVFormat12.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        boolean boolean8 = cSVParser6.isClosed();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        boolean boolean10 = cSVParser6.hasHeaderComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream11 = cSVParser6.stream();
        boolean boolean12 = cSVParser6.hasTrailerComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVRecordStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.util.List<java.lang.String> strList11 = cSVParser6.getHeaderNames();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator12 = cSVParser6.spliterator();
        long long13 = cSVParser6.getCurrentLineNumber();
        boolean boolean14 = cSVParser6.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.List<java.lang.String> strList9 = cSVParser6.getHeaderNames();
        cSVParser6.close();
        long long11 = cSVParser6.getCurrentLineNumber();
        boolean boolean12 = cSVParser6.hasTrailerComment();
        java.lang.String str13 = cSVParser6.getFirstEndOfLine();
        boolean boolean14 = cSVParser6.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode4 = cSVFormat3.getDuplicateHeaderMode();
        java.lang.String str5 = cSVFormat3.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\t" + "'", str1, "\t");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode4 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode4.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowMissingColumnNames();
        java.lang.String[] strArray12 = cSVFormat11.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withCommentMarker('4');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuote(' ');
        org.apache.commons.csv.CSVFormat.Builder builder13 = cSVFormat5.builder();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser6.getRecords();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream8 = cSVParser6.stream();
        long long9 = cSVParser6.getCurrentLineNumber();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator10 = cSVParser6.spliterator();
        boolean boolean11 = cSVParser6.isClosed();
        boolean boolean12 = cSVParser6.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
        org.junit.Assert.assertNotNull(cSVRecordStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withEscape('|');
        boolean boolean10 = cSVFormat7.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat3.printer();
        cSVPrinter5.printComment("\\\t\thi!\t\\n\t\\n\t");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVPrinter5);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('\t');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker((java.lang.Character) '#');
        boolean boolean6 = cSVFormat3.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withAllowMissingColumnNames();
        java.lang.String str5 = cSVFormat4.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withRecordSeparator("\t");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('4');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withFirstRecordAsHeader();
        boolean boolean11 = cSVFormat7.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setDelimiter('\t');
        java.sql.ResultSetMetaData resultSetMetaData5 = null;
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setHeader(resultSetMetaData5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder3 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat1);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withFirstRecordAsHeader();
        java.io.File file5 = null;
        java.nio.charset.Charset charset6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter7 = cSVFormat4.print(file5, charset6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray5 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withHeader(strArray5);
        boolean boolean7 = cSVFormat1.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withNullString("Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false HeaderComments:[,, Delimiter=<\t> Escape=<\\> QuoteMode=<ALL_NON_NULL> NullString=<\\N> RecordSeparator=<\n> SkipHeaderRecord:false, false,-1.0,MongoDBTsv,0]");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        java.sql.ResultSetMetaData resultSetMetaData4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withHeader(resultSetMetaData4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setIgnoreEmptyLines(false);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setTrim(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        boolean boolean2 = cSVFormat0.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withQuote((java.lang.Character) '4');
        java.lang.String[] strArray5 = cSVFormat4.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(strArray5);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        boolean boolean8 = cSVParser6.hasHeaderComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser6.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        java.lang.String str11 = cSVParser6.getTrailerComment();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList12 = cSVParser6.getRecords();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator13 = cSVParser6.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(cSVRecordList12);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator13);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("\\\t\thi!\t\\n\t\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.\\??hi!?\\n?\\n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor7 = cSVParser6.iterator();
        java.lang.String str8 = cSVParser6.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream9 = cSVParser6.stream();
        java.util.List<java.lang.String> strList10 = cSVParser6.getHeaderNames();
        java.util.Spliterator<java.lang.String> strSpliterator11 = strList10.spliterator();
        java.util.Spliterator<java.lang.String> strSpliterator12 = strList10.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordItor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVRecordStream9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertNotNull(strSpliterator12);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setRecordSeparator("false,-1.0,MongoDBTsv,0");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean8 = cSVFormat7.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat10.printer();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean16 = cSVFormat14.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser19 = org.apache.commons.csv.CSVParser.parse("", cSVFormat18);
        java.lang.String str20 = cSVParser19.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cSVParser19.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator22 = cSVParser19.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList23 = cSVParser19.getRecords();
        long long24 = cSVParser19.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream25 = cSVParser19.stream();
        cSVPrinter12.printRecord(cSVRecordStream25);
        boolean boolean27 = cSVFormat6.equals((java.lang.Object) cSVPrinter12);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean32 = cSVFormat30.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser35 = org.apache.commons.csv.CSVParser.parse("", cSVFormat34);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withIgnoreEmptyLines(true);
        java.lang.String str40 = cSVFormat34.getDelimiterString();
        org.apache.commons.csv.CSVParser cSVParser41 = org.apache.commons.csv.CSVParser.parse("\\N", cSVFormat34);
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor42 = cSVParser41.iterator();
        cSVPrinter12.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser41);
        cSVPrinter12.close(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVParser19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strMap21);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator22);
        org.junit.Assert.assertNotNull(cSVRecordList23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordStream25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVParser35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\t" + "'", str40, "\t");
        org.junit.Assert.assertNotNull(cSVParser41);
        org.junit.Assert.assertNotNull(cSVRecordItor42);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        char char7 = cSVFormat6.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreSurroundingSpaces(true);
        java.lang.String[] strArray10 = new java.lang.String[] {};
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withHeader(strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat3.withHeaderComments((java.lang.Object[]) strArray10);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder14 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat3);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat3.withIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\t' + "'", char7 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        boolean boolean4 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withIgnoreHeaderCase();
        boolean boolean6 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withQuote('\"');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withTrim();
        boolean boolean10 = cSVFormat9.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withAllowMissingColumnNames(false);
        java.lang.Character char14 = cSVFormat13.getQuoteCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNull(char14);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord();
        char char4 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withTrailingDelimiter(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\t' + "'", char4 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowMissingColumnNames();
        boolean boolean12 = cSVFormat11.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        boolean boolean1 = cSVFormat0.getSkipHeaderRecord();
        org.apache.commons.csv.QuoteMode quoteMode2 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuoteMode(quoteMode2);
        java.lang.String str4 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withTrim();
        org.apache.commons.csv.QuoteMode quoteMode6 = cSVFormat0.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withAllowDuplicateHeaderNames(false);
        char char9 = cSVFormat0.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + quoteMode2 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode2.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + quoteMode6 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode6.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\t' + "'", char9 == '\t');
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord();
        boolean boolean4 = cSVFormat3.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        java.lang.String str3 = cSVFormat2.toString();
        java.lang.String[] strArray4 = cSVFormat2.getHeaderComments();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false" + "'", str3, "Delimiter=<,> QuoteChar=<\"> QuoteMode=<ALL_NON_NULL> NullString=<> RecordSeparator=<\n> SkipHeaderRecord:false");
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str4 = cSVFormat3.getDelimiterString();
        java.lang.Object obj5 = null;
        boolean boolean6 = cSVFormat3.equals(obj5);
        boolean boolean7 = cSVFormat3.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\t" + "'", str4, "\t");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser6.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVPrinter cSVPrinter5 = cSVFormat3.printer();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean9 = cSVFormat7.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse("", cSVFormat11);
        java.lang.String str13 = cSVParser12.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap14 = cSVParser12.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator15 = cSVParser12.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList16 = cSVParser12.getRecords();
        long long17 = cSVParser12.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream18 = cSVParser12.stream();
        cSVPrinter5.printRecord(cSVRecordStream18);
        cSVPrinter5.printComment("\n");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVPrinter5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVParser12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator15);
        org.junit.Assert.assertNotNull(cSVRecordList16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordStream18);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser6.spliterator();
        boolean boolean8 = cSVParser6.hasHeaderComment();
        java.lang.String str9 = cSVParser6.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean2 = cSVFormat0.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withTrim();
        boolean boolean9 = cSVFormat5.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withRecordSeparator("\\\t\thi!\t\\n\t\\n\t");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord();
        char char2 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('4');
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withFirstRecordAsHeader();
        boolean boolean10 = cSVFormat9.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\t' + "'", char2 == '\t');
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withIgnoreEmptyLines(true);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf(",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.,");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter('\"');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setEscape((java.lang.Character) '\t');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        java.lang.String str7 = cSVParser6.getTrailerComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap8 = cSVParser6.getHeaderMap();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator9 = cSVParser6.spliterator();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList10 = cSVParser6.getRecords();
        long long11 = cSVParser6.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream12 = cSVParser6.stream();
        boolean boolean13 = cSVParser6.isClosed();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList14 = cSVParser6.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strMap8);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator9);
        org.junit.Assert.assertNotNull(cSVRecordList10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(cSVRecordStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVRecordList14);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        boolean boolean3 = cSVFormat1.equals((java.lang.Object) false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse("", cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withIgnoreSurroundingSpaces(false);
        boolean boolean9 = cSVFormat8.isEscapeCharacterSet();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat8.withQuote((java.lang.Character) ' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat8.withAllowDuplicateHeaderNames(false);
        java.sql.ResultSet resultSet17 = null;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withHeader(resultSet17);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withQuote('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVParser6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
    }
}

