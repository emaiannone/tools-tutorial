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
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        java.io.Reader reader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = cSVFormat0.parse(reader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = cSVFormat1.parse(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.Appendable appendable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter2 = cSVFormat0.print(appendable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: appendable");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.lang.Appendable appendable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter2 = cSVFormat0.print(appendable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: appendable");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        boolean boolean3 = cSVFormat2.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLCsv));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.TDF;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.TDF + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.TDF));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.print((java.lang.Object) cSVFormat4, appendable5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter();
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "|" + "'", str5, "|");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setDelimiter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        java.lang.Appendable appendable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat1.print((java.lang.Object) cSVFormat7, appendable10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode0 = org.apache.commons.csv.DuplicateHeaderMode.DISALLOW;
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode0 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.DISALLOW + "'", duplicateHeaderMode0.equals(org.apache.commons.csv.DuplicateHeaderMode.DISALLOW));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.RFC4180;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.RFC4180 + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.RFC4180));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withSystemRecordSeparator();
        boolean boolean2 = cSVFormat0.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        boolean boolean6 = cSVFormat5.isNullStringSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) '#');
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
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str3 = cSVFormat2.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Excel;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Excel + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Excel));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6, (long) (byte) -1, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withEscape((java.lang.Character) ',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The escape character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAutoFlush(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        java.io.Reader reader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser2 = cSVFormat0.parse(reader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        java.lang.String str2 = cSVFormat1.toString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Delimiter=< > SkipHeaderRecord:false" + "'", str2, "Delimiter=< > SkipHeaderRecord:false");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean3 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withNullString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str2 = cSVFormat1.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withTrailingDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "|" + "'", str2, "|");
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withNullString("Delimiter=< > SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder7.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder7.setDelimiter("|");
        java.lang.String[] strArray17 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder13.setHeader(strArray17);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder4.setHeaderComments((java.lang.Object[]) strArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat20 = builder4.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withCommentMarker('\"');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the quoteChar cannot be the same ('\"')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withEscape(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode5 = cSVFormat4.getQuoteMode();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat4, (long) (byte) 1, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + quoteMode5 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode5.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MySQL;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MySQL + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MySQL));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        java.lang.String str6 = cSVFormat5.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\r\n" + "'", str6, "\r\n");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        java.io.Reader reader6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = cSVFormat0.parse(reader6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat0.printer();
        java.sql.ResultSet resultSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter6.printHeaders(resultSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_CSV;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat5.builder();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuoteMode(quoteMode11);
        java.lang.String str13 = cSVFormat12.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.println();
        cSVPrinter8.flush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withCommentMarker(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The comment start character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Oracle;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Oracle + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Oracle));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.csv.QuoteMode quoteMode0 = org.apache.commons.csv.QuoteMode.NONE;
        org.junit.Assert.assertTrue("'" + quoteMode0 + "' != '" + org.apache.commons.csv.QuoteMode.NONE + "'", quoteMode0.equals(org.apache.commons.csv.QuoteMode.NONE));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.csv.QuoteMode quoteMode0 = org.apache.commons.csv.QuoteMode.ALL_NON_NULL;
        org.junit.Assert.assertTrue("'" + quoteMode0 + "' != '" + org.apache.commons.csv.QuoteMode.ALL_NON_NULL + "'", quoteMode0.equals(org.apache.commons.csv.QuoteMode.ALL_NON_NULL));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat11.withTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        boolean boolean4 = cSVFormat1.getAllowMissingColumnNames();
        boolean boolean5 = cSVFormat1.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.csv.QuoteMode quoteMode0 = org.apache.commons.csv.QuoteMode.ALL;
        org.junit.Assert.assertTrue("'" + quoteMode0 + "' != '" + org.apache.commons.csv.QuoteMode.ALL + "'", quoteMode0.equals(org.apache.commons.csv.QuoteMode.ALL));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote('a');
        java.lang.String str6 = cSVFormat3.toString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat3.withTrailingDelimiter(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str6, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAutoFlush(true);
        java.lang.String[] strArray8 = cSVFormat7.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAutoFlush(false);
        boolean boolean6 = cSVFormat2.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat2.withTrailingDelimiter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6, (long) 'a', (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        java.lang.String str4 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote((java.lang.Character) '#');
        boolean boolean9 = cSVFormat8.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat.Builder builder10 = cSVFormat8.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str2 = cSVFormat1.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withAllowMissingColumnNames(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "|" + "'", str2, "|");
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        java.lang.Character char5 = cSVFormat2.getCommentMarker();
        boolean boolean6 = cSVFormat2.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MYSQL;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_TSV;
        java.lang.Class<?> wildcardClass1 = cSVFormat0.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        cSVPrinter8.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter8.flush();
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder20.setDelimiter("|");
        java.lang.String[] strArray30 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder26.setHeader(strArray30);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder17.setHeaderComments((java.lang.Object[]) strArray30);
        cSVPrinter8.printRecords((java.lang.Object[]) strArray30);
        java.sql.ResultSet resultSet34 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter8.printRecords(resultSet34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.InputStream inputStream0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withTrailingDelimiter();
        char char18 = cSVFormat16.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder21 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder21.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder21.setQuote(',');
        java.lang.Object[] objArray26 = new java.lang.Object[] { 1, cSVFormat7, false, cSVFormat20, builder25 };
        java.lang.String str27 = cSVFormat3.format(objArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser28 = org.apache.commons.csv.CSVParser.parse(inputStream0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: inputStream");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + ',' + "'", char18 == ',');
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(objArray26);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1, (long) '4', (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat0.printer();
        boolean boolean7 = cSVFormat0.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat0.printer();
        java.sql.ResultSet resultSet7 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter6.printRecords(resultSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAutoFlush(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAutoFlush(true);
        java.io.File file9 = null;
        java.nio.charset.Charset charset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat8.print(file9, charset10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBCsv));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        boolean boolean2 = cSVFormat0.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        java.lang.String str4 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAutoFlush(false);
        java.lang.String str7 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str9 = cSVFormat8.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat8.printer();
        java.lang.Appendable appendable15 = cSVPrinter14.getOut();
        cSVFormat1.println(appendable15);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "|" + "'", str9, "|");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVPrinter14);
        org.junit.Assert.assertNotNull(appendable15);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withHeader(resultSetMetaData2);
        java.nio.file.Path path4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat0.print(path4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAllowMissingColumnNames(true);
        java.lang.String str4 = cSVFormat1.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        boolean boolean8 = cSVFormat7.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        java.lang.String str6 = cSVFormat3.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str6, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        java.nio.file.Path path13 = null;
        java.nio.charset.Charset charset14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat12.print(path13, charset14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str3 = cSVFormat2.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat2.withDelimiter('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        char char12 = cSVFormat10.getDelimiter();
        java.lang.String[] strArray13 = cSVFormat10.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.ORACLE;
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setAutoFlush(true);
        cSVPrinter6.print((java.lang.Object) builder15);
        java.sql.ResultSet resultSet19 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter6.printHeaders(resultSet19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setRecordSeparator('#');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setRecordSeparator('\"');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        boolean boolean6 = cSVFormat1.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        java.lang.String[] strArray4 = cSVFormat3.getHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        boolean boolean13 = cSVFormat11.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setHeader(resultSet5);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setEscape(',');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder7.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder7.setDelimiter("|");
        java.lang.String[] strArray17 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder13.setHeader(strArray17);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder4.setHeaderComments((java.lang.Object[]) strArray17);
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat26.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter33 = cSVFormat32.printer();
        cSVPrinter33.flush();
        cSVPrinter33.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter33.flush();
        org.apache.commons.csv.CSVFormat.Builder builder38 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder38.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder38.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder42.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder45 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder47 = builder45.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder45.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder45.setDelimiter("|");
        java.lang.String[] strArray55 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder51.setHeader(strArray55);
        org.apache.commons.csv.CSVFormat.Builder builder57 = builder42.setHeaderComments((java.lang.Object[]) strArray55);
        cSVPrinter33.printRecords((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder22.setHeaderComments((java.lang.Object[]) strArray55);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder19.setHeader(strArray55);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVPrinter33);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        boolean boolean6 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        java.lang.String[] strArray11 = null;
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setHeader(strArray11);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setTrim(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder18 = builder14.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnload;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnload + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnload));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        boolean boolean11 = cSVFormat10.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        boolean boolean4 = cSVFormat0.getTrim();
        java.lang.Object[] objArray5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        java.io.File file9 = null;
        java.nio.charset.Charset charset10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat8.print(file9, charset10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        java.io.File file4 = null;
        java.nio.charset.Charset charset5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat3.print(file4, charset5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Builder builder12 = cSVFormat10.builder();
        boolean boolean13 = cSVFormat10.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('4');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote(' ');
        java.sql.ResultSetMetaData resultSetMetaData4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSetMetaData4);
        boolean boolean6 = cSVFormat5.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSetMetaData resultSetMetaData2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSetMetaData2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser4 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        java.lang.String[] strArray11 = null;
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setHeader(strArray11);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        java.sql.ResultSet resultSet15 = null;
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder10.setHeader(resultSet15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.csv.QuoteMode quoteMode0 = org.apache.commons.csv.QuoteMode.NON_NUMERIC;
        org.junit.Assert.assertTrue("'" + quoteMode0 + "' != '" + org.apache.commons.csv.QuoteMode.NON_NUMERIC + "'", quoteMode0.equals(org.apache.commons.csv.QuoteMode.NON_NUMERIC));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        java.lang.Character char6 = cSVFormat3.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat3);
        org.apache.commons.csv.CSVFormat.Builder builder8 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder8.setDelimiter("|");
        java.lang.String[] strArray18 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder14.setHeader(strArray18);
        java.lang.String str20 = cSVFormat3.format((java.lang.Object[]) strArray18);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|" + "'", str20, "\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        boolean boolean5 = cSVParser4.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setQuote('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setAutoFlush(true);
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setHeader(resultSet11);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withAutoFlush(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat3.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean6 = cSVFormat5.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat3.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withIgnoreSurroundingSpaces(true);
        boolean boolean8 = cSVFormat7.isCommentMarkerSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat5.builder();
        java.lang.String str7 = cSVFormat5.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withSkipHeaderRecord(true);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode10 = cSVFormat9.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode10 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode10.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        boolean boolean4 = cSVFormat1.getIgnoreEmptyLines();
        boolean boolean5 = cSVFormat1.getIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder20.setDelimiter("|");
        java.lang.String[] strArray30 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder26.setHeader(strArray30);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder17.setHeaderComments((java.lang.Object[]) strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat11.withHeaderComments((java.lang.Object[]) strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat11.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat16.printer();
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withHeader(resultSet20);
        org.apache.commons.csv.CSVParser cSVParser22 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat19);
        cSVPrinter17.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser22);
        java.util.List<java.lang.String> strList24 = cSVParser22.getHeaderNames();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor25 = cSVParser22.iterator();
        cSVPrinter8.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser22);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVParser22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(cSVRecordItor25);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAutoFlush(true);
        java.lang.String str8 = cSVFormat5.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withEscape((java.lang.Character) 'a');
        char char11 = cSVFormat5.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ',' + "'", char11 == ',');
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat12.printer();
        cSVPrinter13.flush();
        cSVPrinter13.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter13.flush();
        org.apache.commons.csv.CSVFormat.Builder builder18 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder25 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder25.setDelimiter("|");
        java.lang.String[] strArray35 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder31.setHeader(strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder22.setHeaderComments((java.lang.Object[]) strArray35);
        cSVPrinter13.printRecords((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder2.setHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder39.setSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder41.setDelimiter('#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv;
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.InformixUnloadCsv));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        boolean boolean5 = cSVFormat2.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeader(resultSetMetaData9);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode17 = cSVFormat16.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder12.setQuoteMode(quoteMode17);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat3.withQuoteMode(quoteMode17);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + quoteMode17 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode17.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withTrim(false);
        java.nio.file.Path path8 = null;
        java.nio.charset.Charset charset9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat1.print(path8, charset9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setDelimiter("Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSet4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=< > SkipHeaderRecord:false");
        boolean boolean8 = cSVFormat1.equals((java.lang.Object) cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withQuote((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(true);
        boolean boolean6 = cSVFormat1.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode9 = cSVFormat1.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode9 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode9.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str7 = cSVFormat6.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat6.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat6.printer();
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData16 = null;
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setHeader(resultSetMetaData16);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder15.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder15.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder21.setAutoFlush(true);
        cSVPrinter12.print((java.lang.Object) builder21);
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withTrailingDelimiter();
        char char41 = cSVFormat39.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat39.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder44 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder44.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder44.setQuote(',');
        java.lang.Object[] objArray49 = new java.lang.Object[] { 1, cSVFormat30, false, cSVFormat43, builder48 };
        java.lang.String str50 = cSVFormat26.format(objArray49);
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder21.setHeaderComments(objArray49);
        java.lang.String str52 = cSVFormat5.format(objArray49);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "|" + "'", str7, "|");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + ',' + "'", char41 == ',');
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder20.setDelimiter("|");
        java.lang.String[] strArray30 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder26.setHeader(strArray30);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder17.setHeaderComments((java.lang.Object[]) strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat11.withHeaderComments((java.lang.Object[]) strArray30);
        boolean boolean34 = cSVFormat11.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        boolean boolean5 = cSVFormat2.getAllowDuplicateHeaderNames();
        java.lang.String[] strArray6 = cSVFormat2.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.POSTGRESQL_TEXT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator("\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|");
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setQuote('#');
        java.lang.String[] strArray9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeaderComments(strArray9);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        char char5 = cSVFormat3.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat7.builder();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode13 = cSVFormat12.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat7.withQuoteMode(quoteMode13);
        java.lang.String str15 = cSVFormat7.getNullString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser16 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + ',' + "'", char5 == ',');
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + quoteMode13 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode13.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder20.setDelimiter("|");
        java.lang.String[] strArray30 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder26.setHeader(strArray30);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder17.setHeaderComments((java.lang.Object[]) strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat11.withHeaderComments((java.lang.Object[]) strArray30);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode34 = cSVFormat33.getDuplicateHeaderMode();
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat33.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode34 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode34.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
        org.junit.Assert.assertNotNull(cSVFormat36);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrailingDelimiter();
        char char4 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote((java.lang.Character) 'a');
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.lang.String str6 = cSVParser4.getTrailerComment();
        long long7 = cSVParser4.getCurrentLineNumber();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor8 = cSVParser4.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordItor8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        java.lang.String str4 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withRecordSeparator(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setDelimiter('4');
        cSVPrinter8.print((java.lang.Object) builder10);
        java.sql.ResultSet resultSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter8.printRecords(resultSet14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('\"');
        java.lang.Class<?> wildcardClass4 = cSVFormat1.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        java.lang.Class<?> wildcardClass8 = cSVFormat5.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        java.lang.String str5 = cSVParser4.getHeaderComment();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser4.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withAllowDuplicateHeaderNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.lang.String str6 = cSVParser4.getTrailerComment();
        long long7 = cSVParser4.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream8 = cSVParser4.stream();
        long long9 = cSVParser4.getRecordNumber();
        java.lang.String str10 = cSVParser4.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        java.lang.String str13 = cSVFormat11.getRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\r\n" + "'", str13, "\r\n");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withSkipHeaderRecord(false);
        java.io.Reader reader14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser15 = cSVFormat13.parse(reader14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setQuote('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder10 = builder2.setDelimiter("\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder20.setDelimiter("|");
        java.lang.String[] strArray30 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder26.setHeader(strArray30);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder17.setHeaderComments((java.lang.Object[]) strArray30);
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat11.withHeaderComments((java.lang.Object[]) strArray30);
        java.lang.String str34 = cSVFormat33.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean2 = cSVFormat0.getTrim();
        boolean boolean3 = cSVFormat0.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean2 = cSVFormat0.getTrim();
        boolean boolean3 = cSVFormat0.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat4.printer();
        java.lang.Appendable appendable11 = cSVPrinter10.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat0.print(appendable11);
        java.sql.ResultSet resultSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter12.printRecords(resultSet13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "|" + "'", str5, "|");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVPrinter10);
        org.junit.Assert.assertNotNull(appendable11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        java.sql.ResultSet resultSet9 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter8.printRecords(resultSet9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        boolean boolean4 = cSVFormat0.getTrim();
        java.lang.Object[] objArray5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withHeaderComments(objArray5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAutoFlush(true);
        boolean boolean8 = cSVFormat7.isNullStringSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser11 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat7, (-1L), (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder7.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder7.setDelimiter("|");
        java.lang.String[] strArray17 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder13.setHeader(strArray17);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder4.setHeaderComments((java.lang.Object[]) strArray17);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder4.setQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder4.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.Character char2 = cSVFormat1.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withRecordSeparator("");
        boolean boolean5 = cSVFormat1.isEscapeCharacterSet();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = org.apache.commons.csv.CSVParser.parse(reader0, cSVFormat1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.nio.file.Path path0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean3 = cSVFormat2.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser8 = org.apache.commons.csv.CSVParser.parse(path0, charset1, cSVFormat5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: path");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        java.lang.String str4 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAutoFlush(false);
        java.lang.String str7 = cSVFormat1.getRecordSeparator();
        java.lang.Class<?> wildcardClass8 = cSVFormat1.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        java.lang.Character char3 = cSVFormat2.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat2.withNullString(",");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        java.lang.String[] strArray10 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder6.setHeader(strArray10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder6.setRecordSeparator("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder6.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setQuote((java.lang.Character) '#');
        java.sql.ResultSetMetaData resultSetMetaData18 = null;
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setHeader(resultSetMetaData18);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat12.printer();
        cSVPrinter13.flush();
        cSVPrinter13.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter13.flush();
        org.apache.commons.csv.CSVFormat.Builder builder18 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder25 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder25.setDelimiter("|");
        java.lang.String[] strArray35 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder31.setHeader(strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder22.setHeaderComments((java.lang.Object[]) strArray35);
        cSVPrinter13.printRecords((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder2.setHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder39.setSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat42 = builder39.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(cSVFormat42);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withSystemRecordSeparator();
        boolean boolean9 = cSVFormat7.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setCommentMarker('\"');
        java.sql.ResultSetMetaData resultSetMetaData9 = null;
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setHeader(resultSetMetaData9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        boolean boolean7 = cSVFormat1.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat10.withIgnoreSurroundingSpaces(false);
        boolean boolean14 = cSVFormat13.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setNullString("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setDelimiter('4');
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('#');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setTrim(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        char char8 = cSVFormat5.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '4' + "'", char8 == '4');
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat3.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAllowMissingColumnNames();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withQuote(',');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The quoteChar character and the delimiter cannot be the same (',')");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        java.lang.String str5 = cSVFormat2.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "," + "'", str5, ",");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(false);
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
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) 'a');
        boolean boolean6 = cSVFormat5.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSet4);
        boolean boolean6 = cSVFormat5.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setAutoFlush(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode13 = cSVFormat12.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder2.setQuoteMode(quoteMode13);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder2.setAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + quoteMode13 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode13.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        java.lang.Character char6 = cSVFormat4.getCommentMarker();
        boolean boolean7 = cSVFormat4.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.sql.ResultSetMetaData resultSetMetaData1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSetMetaData1);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setAutoFlush(true);
        cSVPrinter6.print((java.lang.Object) builder15);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrailingDelimiter();
        char char35 = cSVFormat33.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder38 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder38.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder38.setQuote(',');
        java.lang.Object[] objArray43 = new java.lang.Object[] { 1, cSVFormat24, false, cSVFormat37, builder42 };
        java.lang.String str44 = cSVFormat20.format(objArray43);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder15.setHeaderComments(objArray43);
        org.apache.commons.csv.CSVFormat.Builder builder47 = builder45.setTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat48 = builder45.build();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + ',' + "'", char35 == ',');
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(cSVFormat48);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAutoFlush(true);
        boolean boolean7 = cSVFormat6.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData14 = null;
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setHeader(resultSetMetaData14);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder13.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setSkipHeaderRecord(false);
        boolean boolean22 = cSVFormat9.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        java.lang.Object obj9 = null;
        cSVPrinter8.print(obj9);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode11 = org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL;
        cSVPrinter8.print((java.lang.Object) duplicateHeaderMode11);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode11 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode11.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        java.lang.String str4 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAutoFlush(false);
        java.lang.String str7 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder2.setQuote('#');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder10.setEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withSystemRecordSeparator();
        java.io.Reader reader9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser10 = cSVFormat8.parse(reader9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.DEFAULT;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withDelimiter('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setAutoFlush(true);
        cSVPrinter6.print((java.lang.Object) builder15);
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder15.setCommentMarker(',');
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setDelimiter('\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat5.builder();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat5.withQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat5.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withEscape((java.lang.Character) '\"');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        java.lang.Character char6 = cSVFormat4.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat14.printer();
        cSVPrinter15.flush();
        cSVPrinter15.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter15.flush();
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder27 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder27.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder27.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder27.setDelimiter("|");
        java.lang.String[] strArray37 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder33.setHeader(strArray37);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder24.setHeaderComments((java.lang.Object[]) strArray37);
        cSVPrinter15.printRecords((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat4.withHeader(strArray37);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVPrinter15);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(cSVFormat41);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        boolean boolean6 = cSVFormat5.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAutoFlush(false);
        boolean boolean11 = cSVFormat7.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withIgnoreHeaderCase();
        boolean boolean17 = cSVFormat7.equals((java.lang.Object) cSVFormat13);
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str19 = cSVFormat18.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat18.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat18.printer();
        java.lang.Appendable appendable25 = cSVPrinter24.getOut();
        cSVFormat5.print((java.lang.Object) boolean17, appendable25, true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "|" + "'", str19, "|");
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVPrinter24);
        org.junit.Assert.assertNotNull(appendable25);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrailingDelimiter();
        char char4 = cSVFormat2.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withQuote((java.lang.Character) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser9 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6, (long) (byte) 0, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + ',' + "'", char4 == ',');
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean2 = cSVFormat0.getTrim();
        boolean boolean3 = cSVFormat0.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat4.printer();
        java.lang.Appendable appendable11 = cSVPrinter10.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat0.print(appendable11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(true);
        java.lang.String str17 = cSVFormat14.getNullString();
        org.apache.commons.csv.CSVPrinter cSVPrinter18 = new org.apache.commons.csv.CSVPrinter(appendable11, cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withSkipHeaderRecord(false);
        java.lang.Character char25 = cSVFormat22.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser26 = org.apache.commons.csv.CSVParser.parse("", cSVFormat22);
        java.lang.String str27 = cSVParser26.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream28 = cSVParser26.stream();
        cSVPrinter18.printRecords(cSVRecordStream28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean31 = cSVFormat30.getIgnoreEmptyLines();
        boolean boolean32 = cSVFormat30.getTrim();
        boolean boolean33 = cSVFormat30.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str35 = cSVFormat34.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat34.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter40 = cSVFormat34.printer();
        java.lang.Appendable appendable41 = cSVPrinter40.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter42 = cSVFormat30.print(appendable41);
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat44.withSkipHeaderRecord(true);
        java.lang.String str47 = cSVFormat44.getNullString();
        org.apache.commons.csv.CSVPrinter cSVPrinter48 = new org.apache.commons.csv.CSVPrinter(appendable41, cSVFormat44);
        org.apache.commons.csv.CSVFormat cSVFormat50 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withSkipHeaderRecord(false);
        java.lang.Character char55 = cSVFormat52.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser56 = org.apache.commons.csv.CSVParser.parse("", cSVFormat52);
        java.lang.String str57 = cSVParser56.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream58 = cSVParser56.stream();
        cSVPrinter48.printRecords(cSVRecordStream58);
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter18.printRecord(cSVRecordStream58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "|" + "'", str5, "|");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVPrinter10);
        org.junit.Assert.assertNotNull(appendable11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNull(char25);
        org.junit.Assert.assertNotNull(cSVParser26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(cSVRecordStream28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "|" + "'", str35, "|");
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVPrinter40);
        org.junit.Assert.assertNotNull(appendable41);
        org.junit.Assert.assertNotNull(cSVPrinter42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNull(char55);
        org.junit.Assert.assertNotNull(cSVParser56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(cSVRecordStream58);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator(' ');
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
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote(' ');
        java.sql.ResultSetMetaData resultSetMetaData4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSetMetaData4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowDuplicateHeaderNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setDelimiter('4');
        cSVPrinter8.print((java.lang.Object) builder10);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withHeader(resultSet16);
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat15);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator19 = cSVParser18.spliterator();
        java.lang.String str20 = cSVParser18.getTrailerComment();
        long long21 = cSVParser18.getCurrentLineNumber();
        cSVPrinter8.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser18);
        long long23 = cSVParser18.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 2L + "'", long23 == 2L);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        boolean boolean5 = cSVFormat2.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat2.withEscape((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        boolean boolean5 = cSVParser4.hasHeaderComment();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor6 = cSVParser4.iterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator7 = cSVParser4.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor6);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator7);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        cSVPrinter8.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter8.flush();
        cSVPrinter8.println();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str15 = cSVFormat14.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter20 = cSVFormat14.printer();
        org.apache.commons.csv.CSVFormat.Builder builder21 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder21.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder21.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder21.setDelimiter("|");
        java.lang.String[] strArray31 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder27.setHeader(strArray31);
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder27.setRecordSeparator("hi!");
        java.lang.Object[] objArray35 = new java.lang.Object[] { builder27 };
        cSVPrinter20.printRecords(objArray35);
        cSVPrinter8.print((java.lang.Object) objArray35);
        java.sql.ResultSet resultSet38 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter8.printRecords(resultSet38, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "|" + "'", str15, "|");
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVPrinter20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(objArray35);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder2.setQuote('#');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote('a');
        java.lang.String str17 = cSVFormat14.toString();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat14.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat14.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat.Builder builder22 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder22.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder29 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder29.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder29.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder29.setDelimiter("|");
        java.lang.String[] strArray39 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder35.setHeader(strArray39);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder26.setHeaderComments((java.lang.Object[]) strArray39);
        java.lang.String str42 = cSVFormat14.format((java.lang.Object[]) strArray39);
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder12.setHeaderComments(strArray39);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str17, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|" + "'", str42, "\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|");
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        java.lang.Character char5 = cSVFormat2.getCommentMarker();
        java.lang.String str6 = cSVFormat2.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "," + "'", str6, ",");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        java.lang.String str4 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setNullString("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setCommentMarker(' ');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setAllowDuplicateHeaderNames(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('#');
        boolean boolean9 = cSVFormat6.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat10);
        cSVPrinter8.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser13);
        java.util.List<java.lang.String> strList15 = cSVParser13.getHeaderNames();
        java.util.Spliterator<java.lang.String> strSpliterator16 = strList15.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder3 = builder1.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.apache.commons.csv.CSVFormat.Builder builder5 = builder3.setDelimiter(",");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean2 = cSVFormat0.getTrim();
        boolean boolean3 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withRecordSeparator('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        java.sql.ResultSetMetaData resultSetMetaData6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSetMetaData6);
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAutoFlush(false);
        boolean boolean12 = cSVFormat8.getTrim();
        boolean boolean13 = cSVFormat8.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean15 = cSVFormat14.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat14.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withDelimiter('a');
        boolean boolean20 = cSVFormat17.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str22 = cSVFormat21.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat21.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat21.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter27 = cSVFormat21.printer();
        java.lang.Appendable appendable28 = cSVPrinter27.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter29 = cSVFormat17.print(appendable28);
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat30.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode34 = cSVFormat33.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat33.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter38 = new org.apache.commons.csv.CSVPrinter(appendable28, cSVFormat37);
        java.lang.Appendable appendable39 = cSVPrinter38.getOut();
        java.lang.Appendable appendable40 = cSVPrinter38.getOut();
        cSVFormat5.print((java.lang.Object) cSVFormat8, appendable40, false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "|" + "'", str22, "|");
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVPrinter27);
        org.junit.Assert.assertNotNull(appendable28);
        org.junit.Assert.assertNotNull(cSVPrinter29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + quoteMode34 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode34.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(appendable39);
        org.junit.Assert.assertNotNull(appendable40);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.valueOf("|");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No enum constant org.apache.commons.csv.CSVFormat.Predefined.|");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAutoFlush(true);
        boolean boolean7 = cSVFormat6.isNullStringSet();
        java.lang.String[] strArray8 = cSVFormat6.getHeaderComments();
        org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat6.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(cSVPrinter9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = cSVFormat5.builder();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAutoFlush(true);
        boolean boolean7 = cSVFormat6.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSystemRecordSeparator();
        java.nio.file.Path path11 = null;
        java.nio.charset.Charset charset12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat9.print(path11, charset12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        java.lang.String str4 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAutoFlush(false);
        java.lang.String str7 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        boolean boolean11 = cSVFormat0.isCommentMarkerSet();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat0.withDelimiter('\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat3.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrailingDelimiter();
        char char22 = cSVFormat20.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setQuote(',');
        java.lang.Object[] objArray30 = new java.lang.Object[] { 1, cSVFormat11, false, cSVFormat24, builder29 };
        java.lang.String str31 = cSVFormat7.format(objArray30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat5.withHeaderComments(objArray30);
        java.io.Reader reader33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser34 = cSVFormat5.parse(reader33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + ',' + "'", char22 == ',');
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(cSVFormat32);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setHeader(resultSet7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setQuote('\"');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.Appendable appendable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.println(appendable1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '\\');
        java.lang.String str8 = cSVFormat5.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        java.lang.Character char6 = cSVFormat3.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat3);
        java.lang.String str8 = cSVParser7.getHeaderComment();
        long long9 = cSVParser7.getRecordNumber();
        java.util.Map<java.lang.String, java.lang.Integer> strMap10 = cSVParser7.getHeaderMap();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList11 = cSVParser7.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(strMap10);
        org.junit.Assert.assertNotNull(cSVRecordList11);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Builder builder12 = cSVFormat10.builder();
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setAutoFlush(false);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        boolean boolean2 = cSVFormat0.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean2 = cSVFormat1.getIgnoreEmptyLines();
        boolean boolean3 = cSVFormat1.getTrim();
        boolean boolean4 = cSVFormat1.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str6 = cSVFormat5.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat5.printer();
        java.lang.Appendable appendable12 = cSVPrinter11.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat1.print(appendable12);
        cSVFormat0.println(appendable12);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat15.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode19 = cSVFormat18.getQuoteMode();
        java.sql.ResultSet resultSet20 = null;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat18.withHeader(resultSet20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter30 = cSVFormat29.printer();
        cSVPrinter30.flush();
        cSVPrinter30.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter30.flush();
        org.apache.commons.csv.CSVFormat.Builder builder35 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder35.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder35.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder39.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder42 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder42.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder42.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder42.setDelimiter("|");
        java.lang.String[] strArray52 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder48.setHeader(strArray52);
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder39.setHeaderComments((java.lang.Object[]) strArray52);
        cSVPrinter30.printRecords((java.lang.Object[]) strArray52);
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat21.withHeader(strArray52);
        org.apache.commons.csv.CSVPrinter cSVPrinter57 = new org.apache.commons.csv.CSVPrinter(appendable12, cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "|" + "'", str6, "|");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVPrinter11);
        org.junit.Assert.assertNotNull(appendable12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + quoteMode19 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode19.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVPrinter30);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(cSVFormat56);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withDelimiter(' ');
        boolean boolean8 = cSVFormat3.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote('\"');
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter26 = cSVFormat25.printer();
        cSVPrinter26.flush();
        cSVPrinter26.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter26.flush();
        org.apache.commons.csv.CSVFormat.Builder builder31 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder31.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder31.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder35.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder38 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder38.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder38.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder38.setDelimiter("|");
        java.lang.String[] strArray48 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder44.setHeader(strArray48);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder35.setHeaderComments((java.lang.Object[]) strArray48);
        cSVPrinter26.printRecords((java.lang.Object[]) strArray48);
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder17.setHeaderComments(strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray48);
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder2.setHeader(strArray48);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder54.setQuote('4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVPrinter26);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrailingDelimiter();
        boolean boolean5 = cSVFormat3.isEscapeCharacterSet();
        boolean boolean6 = cSVFormat3.getSkipHeaderRecord();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse("\r\n", cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVParser3);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        java.lang.String str4 = cSVFormat1.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withIgnoreHeaderCase(false);
        boolean boolean7 = cSVFormat6.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat5.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        boolean boolean5 = cSVFormat2.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat2.withTrim(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withQuote('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        boolean boolean4 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat0.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withNullString("\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|");
        java.lang.Class<?> wildcardClass13 = cSVFormat6.getClass();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator6 = cSVParser4.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat12.printer();
        cSVPrinter13.flush();
        cSVPrinter13.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter13.flush();
        org.apache.commons.csv.CSVFormat.Builder builder18 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder25 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder25.setDelimiter("|");
        java.lang.String[] strArray35 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder31.setHeader(strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder22.setHeaderComments((java.lang.Object[]) strArray35);
        cSVPrinter13.printRecords((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder2.setHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat40 = builder39.build();
        boolean boolean41 = cSVFormat40.getTrim();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withCommentMarker('\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setRecordSeparator('#');
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setRecordSeparator("\r\n");
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setTrailingDelimiter(true);
        java.lang.Appendable appendable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVFormat0.print((java.lang.Object) true, appendable12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        boolean boolean4 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat0.equals((java.lang.Object) cSVFormat6);
        java.nio.file.Path path11 = null;
        java.nio.charset.Charset charset12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat6.print(path11, charset12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        char char2 = cSVFormat1.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + ',' + "'", char2 == ',');
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean2 = cSVFormat0.getTrim();
        char char3 = cSVFormat0.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVPrinter cSVPrinter2 = cSVFormat1.printer();
        java.sql.ResultSet resultSet3 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter2.printRecords(resultSet3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVPrinter2);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setDelimiter('4');
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setCommentMarker((java.lang.Character) ',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setDelimiter("|");
        java.lang.String[] strArray19 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder15.setHeader(strArray19);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder8.setHeader(strArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat26 = cSVFormat25.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat29.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat30.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter37 = cSVFormat36.printer();
        cSVPrinter37.flush();
        cSVPrinter37.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter37.flush();
        org.apache.commons.csv.CSVFormat.Builder builder42 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder42.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder42.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder46.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder49 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder49.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder49.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder55 = builder49.setDelimiter("|");
        java.lang.String[] strArray59 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder55.setHeader(strArray59);
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder46.setHeaderComments((java.lang.Object[]) strArray59);
        cSVPrinter37.printRecords((java.lang.Object[]) strArray59);
        java.lang.String str63 = cSVFormat27.format((java.lang.Object[]) strArray59);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat25.withHeader(strArray59);
        org.apache.commons.csv.CSVFormat.Builder builder65 = builder21.setHeaderComments(strArray59);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVPrinter37);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|" + "'", str63, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withQuote('#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean2 = cSVFormat0.getTrim();
        boolean boolean3 = cSVFormat0.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean5 = cSVFormat4.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withDelimiter('a');
        boolean boolean10 = cSVFormat7.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str12 = cSVFormat11.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat11.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter17 = cSVFormat11.printer();
        java.lang.Appendable appendable18 = cSVPrinter17.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter19 = cSVFormat7.print(appendable18);
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode24 = cSVFormat23.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter28 = new org.apache.commons.csv.CSVPrinter(appendable18, cSVFormat27);
        java.lang.Appendable appendable29 = cSVPrinter28.getOut();
        java.lang.Appendable appendable30 = cSVPrinter28.getOut();
        org.apache.commons.csv.CSVFormat cSVFormat31 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.Character char32 = cSVFormat31.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat31.withRecordSeparator("");
        java.sql.ResultSet resultSet35 = null;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withHeader(resultSet35);
        org.apache.commons.csv.CSVFormat cSVFormat37 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str38 = cSVFormat37.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat37.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat37.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter43 = cSVFormat37.printer();
        org.apache.commons.csv.CSVFormat.Builder builder44 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder44.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder44.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder44.setDelimiter("|");
        java.lang.String[] strArray54 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder55 = builder50.setHeader(strArray54);
        org.apache.commons.csv.CSVFormat.Builder builder57 = builder50.setRecordSeparator("hi!");
        java.lang.Object[] objArray58 = new java.lang.Object[] { builder50 };
        cSVPrinter43.printRecords(objArray58);
        java.lang.String str60 = cSVFormat34.format(objArray58);
        cSVFormat0.printRecord(appendable30, objArray58);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "|" + "'", str12, "|");
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVPrinter17);
        org.junit.Assert.assertNotNull(appendable18);
        org.junit.Assert.assertNotNull(cSVPrinter19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + quoteMode24 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode24.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(appendable29);
        org.junit.Assert.assertNotNull(appendable30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNull(char32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "|" + "'", str38, "|");
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVPrinter43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(objArray58);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker(',');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        boolean boolean4 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Builder builder12 = cSVFormat10.builder();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean14 = cSVFormat13.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat13.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withDelimiter('a');
        boolean boolean19 = cSVFormat16.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat20 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str21 = cSVFormat20.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat20.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat20.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter26 = cSVFormat20.printer();
        java.lang.Appendable appendable27 = cSVPrinter26.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter28 = cSVFormat16.print(appendable27);
        org.apache.commons.csv.CSVFormat cSVFormat29 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withAutoFlush(true);
        boolean boolean32 = cSVFormat31.getTrailingDelimiter();
        org.apache.commons.csv.CSVPrinter cSVPrinter33 = new org.apache.commons.csv.CSVPrinter(appendable27, cSVFormat31);
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.Character char35 = cSVFormat34.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat34.withRecordSeparator("");
        java.sql.ResultSet resultSet38 = null;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat37.withHeader(resultSet38);
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str41 = cSVFormat40.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter46 = cSVFormat40.printer();
        org.apache.commons.csv.CSVFormat.Builder builder47 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder47.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder47.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder47.setDelimiter("|");
        java.lang.String[] strArray57 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder58 = builder53.setHeader(strArray57);
        org.apache.commons.csv.CSVFormat.Builder builder60 = builder53.setRecordSeparator("hi!");
        java.lang.Object[] objArray61 = new java.lang.Object[] { builder53 };
        cSVPrinter46.printRecords(objArray61);
        java.lang.String str63 = cSVFormat37.format(objArray61);
        cSVFormat10.printRecord(appendable27, objArray61);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "|" + "'", str21, "|");
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVPrinter26);
        org.junit.Assert.assertNotNull(appendable27);
        org.junit.Assert.assertNotNull(cSVPrinter28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNull(char35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "|" + "'", str41, "|");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVPrinter46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(objArray61);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        java.lang.String[] strArray10 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder6.setHeader(strArray10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder6.setRecordSeparator("hi!");
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode14 = org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY;
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder6.setDuplicateHeaderMode(duplicateHeaderMode14);
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder6.setCommentMarker('a');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setSkipHeaderRecord(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat cSVFormat20 = builder19.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The header contains a duplicate name: \"Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<??> EmptyLines:ignored SkipHeaderRecord:false\" in [Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<??> EmptyLines:ignored SkipHeaderRecord:false, Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<??> EmptyLines:ignored SkipHeaderRecord:false, |]. If this is valid then use CSVFormat.Builder.setDuplicateHeaderMode().");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode14 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY + "'", duplicateHeaderMode14.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY));
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withAllowMissingColumnNames(false);
        java.lang.String[] strArray3 = cSVFormat0.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setNullString("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setCommentMarker(' ');
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat21.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = cSVFormat23.printer();
        cSVPrinter24.flush();
        cSVPrinter24.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter24.flush();
        org.apache.commons.csv.CSVFormat.Builder builder29 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder29.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder29.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder33.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder36 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder36.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder36.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder36.setDelimiter("|");
        java.lang.String[] strArray46 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder47 = builder42.setHeader(strArray46);
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder33.setHeaderComments((java.lang.Object[]) strArray46);
        cSVPrinter24.printRecords((java.lang.Object[]) strArray46);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder13.setHeaderComments((java.lang.Object[]) strArray46);
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder10.setHeaderComments(strArray46);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVPrinter24);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('#');
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withQuote((java.lang.Character) '#');
        boolean boolean8 = cSVFormat5.getTrim();
        org.apache.commons.csv.CSVFormat.Builder builder9 = cSVFormat5.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withIgnoreHeaderCase(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser6 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat3, (long) 100, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat12.printer();
        cSVPrinter13.flush();
        cSVPrinter13.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter13.flush();
        org.apache.commons.csv.CSVFormat.Builder builder18 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder25 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder25.setDelimiter("|");
        java.lang.String[] strArray35 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder31.setHeader(strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder22.setHeaderComments((java.lang.Object[]) strArray35);
        cSVPrinter13.printRecords((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder2.setHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder39.setSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder39.setIgnoreEmptyLines(false);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode44 = org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY;
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder43.setDuplicateHeaderMode(duplicateHeaderMode44);
        org.apache.commons.csv.CSVFormat.Builder builder47 = builder43.setCommentMarker('a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode44 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY + "'", duplicateHeaderMode44.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY));
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSet4);
        boolean boolean6 = cSVFormat3.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder4.setEscape(',');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder4.setQuote('\\');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) 'a');
        java.lang.String str16 = cSVFormat15.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> CommentStart=<a> RecordSeparator=<\n> EmptyLines:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false HeaderComments:[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]" + "'", str16, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> CommentStart=<a> RecordSeparator=<\n> EmptyLines:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false HeaderComments:[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat0.printer();
        java.lang.Appendable appendable7 = cSVPrinter6.getOut();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat8.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat9.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat13.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat15.printer();
        cSVPrinter16.flush();
        org.apache.commons.csv.CSVFormat.Builder builder18 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setDelimiter('4');
        cSVPrinter16.print((java.lang.Object) builder18);
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet24 = null;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withHeader(resultSet24);
        org.apache.commons.csv.CSVParser cSVParser26 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat23);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator27 = cSVParser26.spliterator();
        java.lang.String str28 = cSVParser26.getTrailerComment();
        long long29 = cSVParser26.getCurrentLineNumber();
        cSVPrinter16.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser26);
        cSVPrinter16.printComment("|");
        org.apache.commons.csv.CSVFormat cSVFormat34 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat34.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat36.withSkipHeaderRecord(false);
        java.lang.Character char39 = cSVFormat36.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser40 = org.apache.commons.csv.CSVParser.parse("", cSVFormat36);
        java.lang.String str41 = cSVParser40.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream42 = cSVParser40.stream();
        cSVPrinter16.printRecords(cSVRecordStream42);
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter6.printRecord(cSVRecordStream42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
        org.junit.Assert.assertNotNull(appendable7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVPrinter16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVParser26);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNull(char39);
        org.junit.Assert.assertNotNull(cSVParser40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(cSVRecordStream42);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAllowDuplicateHeaderNames(false);
        java.sql.ResultSet resultSet8 = null;
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withHeader(resultSet8);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat10);
        cSVPrinter8.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser13);
        long long15 = cSVParser13.getCurrentLineNumber();
        boolean boolean16 = cSVParser13.hasHeaderComment();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList17 = cSVParser13.getRecords();
        java.util.Map<java.lang.String, java.lang.Integer> strMap18 = cSVParser13.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2L + "'", long15 == 2L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cSVRecordList17);
        org.junit.Assert.assertNull(strMap18);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder2.setQuote('#');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setQuote((java.lang.Character) ',');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        java.lang.Character char3 = cSVFormat1.getCommentMarker();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNull(char3);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str7 = cSVFormat6.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Builder builder9 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData12 = null;
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setHeader(resultSetMetaData12);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode20 = cSVFormat19.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder15.setQuoteMode(quoteMode20);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat8.withQuoteMode(quoteMode20);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + quoteMode20 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode20.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(cSVFormat22);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        boolean boolean4 = cSVFormat3.getIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        java.lang.String str7 = cSVFormat6.getRecordSeparator();
        java.lang.String str8 = cSVFormat6.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        java.lang.String str4 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAutoFlush(false);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote((java.lang.Character) '#');
        boolean boolean9 = cSVFormat8.getIgnoreEmptyLines();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        boolean boolean4 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withIgnoreHeaderCase();
        boolean boolean10 = cSVFormat0.equals((java.lang.Object) cSVFormat6);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat6.withTrim(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.EXCEL;
        java.lang.Character char2 = cSVFormat1.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser3 = org.apache.commons.csv.CSVParser.parse(" ", cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNull(char2);
        org.junit.Assert.assertNotNull(cSVParser3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setDelimiter('4');
        cSVPrinter8.print((java.lang.Object) builder10);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withHeader(resultSet16);
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat15);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator19 = cSVParser18.spliterator();
        java.lang.String str20 = cSVParser18.getTrailerComment();
        long long21 = cSVParser18.getCurrentLineNumber();
        cSVPrinter8.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser18);
        cSVPrinter8.printComment("|");
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withHeader(resultSet27);
        org.apache.commons.csv.CSVParser cSVParser29 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat26);
        java.lang.String str30 = cSVParser29.getHeaderComment();
        cSVPrinter8.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser29);
        boolean boolean32 = cSVParser29.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVParser29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat11.withHeader(resultSet13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withQuote((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        java.lang.String[] strArray11 = null;
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setHeader(strArray11);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter25 = cSVFormat24.printer();
        cSVPrinter25.flush();
        cSVPrinter25.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter25.flush();
        org.apache.commons.csv.CSVFormat.Builder builder30 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder30.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder30.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder34.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder37 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder37.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder37.setDelimiter("|");
        java.lang.String[] strArray47 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder43.setHeader(strArray47);
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder34.setHeaderComments((java.lang.Object[]) strArray47);
        cSVPrinter25.printRecords((java.lang.Object[]) strArray47);
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder14.setHeader(strArray47);
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder14.setCommentMarker((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVPrinter25);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.print((java.lang.Object) "Delimiter=< > SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter19 = cSVFormat18.printer();
        cSVPrinter19.flush();
        cSVPrinter19.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter19.flush();
        cSVPrinter19.println();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str26 = cSVFormat25.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat25.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter31 = cSVFormat25.printer();
        org.apache.commons.csv.CSVFormat.Builder builder32 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder32.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder32.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder32.setDelimiter("|");
        java.lang.String[] strArray42 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder38.setHeader(strArray42);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder38.setRecordSeparator("hi!");
        java.lang.Object[] objArray46 = new java.lang.Object[] { builder38 };
        cSVPrinter31.printRecords(objArray46);
        cSVPrinter19.print((java.lang.Object) objArray46);
        cSVPrinter8.printRecords(objArray46);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVPrinter19);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "|" + "'", str26, "|");
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVPrinter31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(',');
        boolean boolean2 = cSVFormat1.getIgnoreHeaderCase();
        boolean boolean3 = cSVFormat1.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str8 = cSVFormat7.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat7.printer();
        java.lang.Appendable appendable14 = cSVPrinter13.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat3.print(appendable14);
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat3.withQuote('\\');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "|" + "'", str8, "|");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(appendable14);
        org.junit.Assert.assertNotNull(cSVPrinter15);
        org.junit.Assert.assertNotNull(cSVFormat17);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.lang.String str6 = cSVParser4.getTrailerComment();
        long long7 = cSVParser4.getCurrentLineNumber();
        boolean boolean8 = cSVParser4.hasTrailerComment();
        java.lang.String str9 = cSVParser4.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withIgnoreHeaderCase(true);
        java.lang.String[] strArray6 = cSVFormat0.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(strArray6);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder5 = org.apache.commons.csv.CSVFormat.Builder.create(cSVFormat2);
        org.apache.commons.csv.CSVFormat.Builder builder7 = builder5.setDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setDelimiter('4');
        cSVPrinter8.print((java.lang.Object) builder10);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withHeader(resultSet16);
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat15);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator19 = cSVParser18.spliterator();
        java.lang.String str20 = cSVParser18.getTrailerComment();
        long long21 = cSVParser18.getCurrentLineNumber();
        cSVPrinter8.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser18);
        cSVPrinter8.printComment("|");
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean26 = cSVFormat25.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withDelimiter('a');
        boolean boolean31 = cSVFormat28.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str33 = cSVFormat32.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter38 = cSVFormat32.printer();
        java.lang.Appendable appendable39 = cSVPrinter38.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter40 = cSVFormat28.print(appendable39);
        cSVPrinter8.print((java.lang.Object) cSVPrinter40);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "|" + "'", str33, "|");
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVPrinter38);
        org.junit.Assert.assertNotNull(appendable39);
        org.junit.Assert.assertNotNull(cSVPrinter40);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setDelimiter('4');
        cSVPrinter8.print((java.lang.Object) builder10);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withHeader(resultSet16);
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat15);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator19 = cSVParser18.spliterator();
        java.lang.String str20 = cSVParser18.getTrailerComment();
        long long21 = cSVParser18.getCurrentLineNumber();
        cSVPrinter8.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser18);
        cSVPrinter8.printComment("|");
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withSkipHeaderRecord(false);
        java.lang.Character char31 = cSVFormat28.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser32 = org.apache.commons.csv.CSVParser.parse("", cSVFormat28);
        java.lang.String str33 = cSVParser32.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream34 = cSVParser32.stream();
        cSVPrinter8.printRecords(cSVRecordStream34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean37 = cSVFormat36.getIgnoreEmptyLines();
        boolean boolean38 = cSVFormat36.getTrim();
        boolean boolean39 = cSVFormat36.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat40 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str41 = cSVFormat40.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat43 = cSVFormat40.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat40.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter46 = cSVFormat40.printer();
        java.lang.Appendable appendable47 = cSVPrinter46.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter48 = cSVFormat36.print(appendable47);
        org.apache.commons.csv.CSVFormat cSVFormat49 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat49.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat50.withSkipHeaderRecord(true);
        java.lang.String str53 = cSVFormat50.getNullString();
        org.apache.commons.csv.CSVPrinter cSVPrinter54 = new org.apache.commons.csv.CSVPrinter(appendable47, cSVFormat50);
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat58 = cSVFormat56.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat60 = cSVFormat58.withSkipHeaderRecord(false);
        java.lang.Character char61 = cSVFormat58.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser62 = org.apache.commons.csv.CSVParser.parse("", cSVFormat58);
        java.lang.String str63 = cSVParser62.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream64 = cSVParser62.stream();
        cSVPrinter54.printRecords(cSVRecordStream64);
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter8.printRecords(cSVRecordStream64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: stream has already been operated upon or closed");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNull(char31);
        org.junit.Assert.assertNotNull(cSVParser32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(cSVRecordStream34);
        org.junit.Assert.assertNotNull(cSVFormat36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "|" + "'", str41, "|");
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVPrinter46);
        org.junit.Assert.assertNotNull(appendable47);
        org.junit.Assert.assertNotNull(cSVPrinter48);
        org.junit.Assert.assertNotNull(cSVFormat49);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat60);
        org.junit.Assert.assertNull(char61);
        org.junit.Assert.assertNotNull(cSVParser62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(cSVRecordStream64);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        boolean boolean8 = cSVFormat5.getSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.println();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean11 = cSVFormat10.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withQuote(' ');
        java.lang.Object[] objArray19 = new java.lang.Object[] { cSVFormat12, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat10.withHeaderComments(objArray19);
        cSVPrinter8.printRecord(objArray19);
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat22.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat23.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter30 = cSVFormat29.printer();
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet33 = null;
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withHeader(resultSet33);
        org.apache.commons.csv.CSVParser cSVParser35 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat32);
        cSVPrinter30.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser35);
        long long37 = cSVParser35.getCurrentLineNumber();
        boolean boolean38 = cSVParser35.hasHeaderComment();
        cSVPrinter8.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser35);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVPrinter30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVParser35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 2L + "'", long37 == 2L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setTrim(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames(false);
        boolean boolean8 = cSVFormat3.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withQuote('\"');
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat18 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat18.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat23.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter26 = cSVFormat25.printer();
        cSVPrinter26.flush();
        cSVPrinter26.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter26.flush();
        org.apache.commons.csv.CSVFormat.Builder builder31 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder31.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder31.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder35.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder38 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder38.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder38.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder38.setDelimiter("|");
        java.lang.String[] strArray48 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder44.setHeader(strArray48);
        org.apache.commons.csv.CSVFormat.Builder builder50 = builder35.setHeaderComments((java.lang.Object[]) strArray48);
        cSVPrinter26.printRecords((java.lang.Object[]) strArray48);
        org.apache.commons.csv.CSVFormat.Builder builder52 = builder17.setHeaderComments(strArray48);
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat6.withHeaderComments((java.lang.Object[]) strArray48);
        org.apache.commons.csv.CSVFormat.Builder builder54 = builder2.setHeader(strArray48);
        org.apache.commons.csv.CSVFormat.Builder builder56 = builder54.setEscape(',');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVPrinter26);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        boolean boolean4 = cSVFormat0.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withCommentMarker((java.lang.Character) '#');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        char char12 = cSVFormat10.getDelimiter();
        boolean boolean13 = cSVFormat10.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        java.lang.Character char5 = cSVFormat4.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNull(char5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAutoFlush(true);
        java.lang.String str8 = cSVFormat7.toString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str8, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.lang.String str6 = cSVParser4.getTrailerComment();
        java.util.List<org.apache.commons.csv.CSVRecord> cSVRecordList7 = cSVParser4.getRecords();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(cSVRecordList7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        java.lang.String[] strArray11 = null;
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setHeader(strArray11);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setTrim(false);
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder14.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean20 = cSVFormat19.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat21 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withQuote(' ');
        java.lang.Object[] objArray28 = new java.lang.Object[] { cSVFormat21, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat19.withHeaderComments(objArray28);
        org.apache.commons.csv.QuoteMode quoteMode30 = cSVFormat29.getQuoteMode();
        char char31 = cSVFormat29.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat29.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.QuoteMode quoteMode34 = cSVFormat29.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder14.setQuoteMode(quoteMode34);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertTrue("'" + quoteMode30 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode30.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + ',' + "'", char31 == ',');
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + quoteMode34 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode34.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        java.lang.String str4 = cSVFormat1.toString();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withAutoFlush(false);
        java.lang.String str7 = cSVFormat1.getRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat1.withIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str4, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\n" + "'", str7, "\r\n");
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter6 = cSVFormat0.printer();
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder9.setHeader(resultSetMetaData10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder9.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder9.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setAutoFlush(true);
        cSVPrinter6.print((java.lang.Object) builder15);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat24 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat24.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat27.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat27.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat33.withTrailingDelimiter();
        char char35 = cSVFormat33.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat33.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder38 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder40 = builder38.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder38.setQuote(',');
        java.lang.Object[] objArray43 = new java.lang.Object[] { 1, cSVFormat24, false, cSVFormat37, builder42 };
        java.lang.String str44 = cSVFormat20.format(objArray43);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder15.setHeaderComments(objArray43);
        org.apache.commons.csv.CSVFormat.Builder builder47 = builder45.setIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder47.setTrim(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVPrinter6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + ',' + "'", char35 == ',');
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str8 = cSVFormat7.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat7.printer();
        java.lang.Appendable appendable14 = cSVPrinter13.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat3.print(appendable14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode20 = cSVFormat19.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = new org.apache.commons.csv.CSVPrinter(appendable14, cSVFormat23);
        java.lang.Appendable appendable25 = cSVPrinter24.getOut();
        java.lang.Appendable appendable26 = cSVPrinter24.getOut();
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat28.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat30.withSkipHeaderRecord(false);
        java.lang.Character char33 = cSVFormat30.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser34 = org.apache.commons.csv.CSVParser.parse("", cSVFormat30);
        java.lang.String str35 = cSVParser34.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream36 = cSVParser34.stream();
        long long37 = cSVParser34.getCurrentLineNumber();
        cSVPrinter24.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser34);
        cSVPrinter24.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> NullString=<hi!> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "|" + "'", str8, "|");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(appendable14);
        org.junit.Assert.assertNotNull(cSVPrinter15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + quoteMode20 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode20.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(appendable25);
        org.junit.Assert.assertNotNull(appendable26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNull(char33);
        org.junit.Assert.assertNotNull(cSVParser34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(cSVRecordStream36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat10);
        cSVPrinter8.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser13);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter23 = cSVFormat22.printer();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet26 = null;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withHeader(resultSet26);
        org.apache.commons.csv.CSVParser cSVParser28 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat25);
        cSVPrinter23.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser28);
        java.util.Map<java.lang.String, java.lang.Integer> strMap30 = cSVParser28.getHeaderMap();
        cSVPrinter8.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser28);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str33 = cSVFormat32.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat32.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter38 = cSVFormat32.printer();
        org.apache.commons.csv.CSVFormat.Builder builder39 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder39.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData42 = null;
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder41.setHeader(resultSetMetaData42);
        org.apache.commons.csv.CSVFormat.Builder builder45 = builder41.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder47 = builder41.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder47.setAutoFlush(true);
        cSVPrinter38.print((java.lang.Object) builder47);
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat54 = cSVFormat52.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat56 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat57 = cSVFormat56.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat58 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat59 = cSVFormat58.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat61 = cSVFormat59.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat63 = cSVFormat59.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat64 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat65 = cSVFormat64.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat66 = cSVFormat65.withTrailingDelimiter();
        char char67 = cSVFormat65.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat69 = cSVFormat65.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder70 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder72 = builder70.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder74 = builder70.setQuote(',');
        java.lang.Object[] objArray75 = new java.lang.Object[] { 1, cSVFormat56, false, cSVFormat69, builder74 };
        java.lang.String str76 = cSVFormat52.format(objArray75);
        org.apache.commons.csv.CSVFormat.Builder builder77 = builder47.setHeaderComments(objArray75);
        cSVPrinter8.printRecord(objArray75);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVPrinter23);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVParser28);
        org.junit.Assert.assertNull(strMap30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "|" + "'", str33, "|");
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVPrinter38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat54);
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(cSVFormat57);
        org.junit.Assert.assertNotNull(cSVFormat58);
        org.junit.Assert.assertNotNull(cSVFormat59);
        org.junit.Assert.assertNotNull(cSVFormat61);
        org.junit.Assert.assertNotNull(cSVFormat63);
        org.junit.Assert.assertNotNull(cSVFormat64);
        org.junit.Assert.assertNotNull(cSVFormat65);
        org.junit.Assert.assertNotNull(cSVFormat66);
        org.junit.Assert.assertTrue("'" + char67 + "' != '" + ',' + "'", char67 == ',');
        org.junit.Assert.assertNotNull(cSVFormat69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(builder77);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setRecordSeparator("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat3.getQuoteMode();
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeader(resultSet5);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat8.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat14.printer();
        cSVPrinter15.flush();
        cSVPrinter15.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter15.flush();
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder27 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder27.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder27.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder27.setDelimiter("|");
        java.lang.String[] strArray37 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder33.setHeader(strArray37);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder24.setHeaderComments((java.lang.Object[]) strArray37);
        cSVPrinter15.printRecords((java.lang.Object[]) strArray37);
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat6.withHeader(strArray37);
        boolean boolean42 = cSVFormat6.getIgnoreSurroundingSpaces();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVPrinter15);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.lang.String str6 = cSVParser4.getTrailerComment();
        long long7 = cSVParser4.getCurrentLineNumber();
        boolean boolean8 = cSVParser4.hasTrailerComment();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor9 = cSVParser4.iterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVRecordItor9);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat5.builder();
        java.lang.String str7 = cSVFormat5.getNullString();
        boolean boolean8 = cSVFormat5.getAllowDuplicateHeaderNames();
        boolean boolean9 = cSVFormat5.getIgnoreHeaderCase();
        char char10 = cSVFormat5.getDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ',' + "'", char10 == ',');
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote(' ');
        java.sql.ResultSetMetaData resultSetMetaData4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSetMetaData4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreEmptyLines(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat3.getQuoteMode();
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeader(resultSet5);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat3.withHeader(resultSet7);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setNullString("\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str8 = cSVFormat7.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat7.printer();
        java.lang.Appendable appendable14 = cSVPrinter13.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat3.print(appendable14);
        java.lang.String str16 = cSVFormat3.getNullString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "|" + "'", str8, "|");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(appendable14);
        org.junit.Assert.assertNotNull(cSVPrinter15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        boolean boolean6 = cSVFormat5.isCommentMarkerSet();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("Delimiter=< > SkipHeaderRecord:false", cSVFormat5);
        java.lang.String str8 = cSVParser7.getHeaderComment();
        java.lang.String str9 = cSVParser7.getFirstEndOfLine();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setAutoFlush(true);
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder8.setHeader(resultSet11);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder8.setTrim(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat9.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat.Builder builder13 = cSVFormat12.builder();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.apache.commons.csv.CSVFormat.Builder builder16 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData19 = null;
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setHeader(resultSetMetaData19);
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder18.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder18.setQuote('#');
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setIgnoreHeaderCase(true);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode29 = org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY;
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder26.setDuplicateHeaderMode(duplicateHeaderMode29);
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder13.setDuplicateHeaderMode(duplicateHeaderMode29);
        boolean boolean32 = cSVFormat9.equals((java.lang.Object) builder13);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode29 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY + "'", duplicateHeaderMode29.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY));
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder4.setAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder4.setEscape(',');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder4.setAllowMissingColumnNames(false);
        java.sql.ResultSet resultSet13 = null;
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder4.setHeader(resultSet13);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setSkipHeaderRecord(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean2 = cSVFormat0.getTrim();
        boolean boolean3 = cSVFormat0.getAllowDuplicateHeaderNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str5 = cSVFormat4.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat4.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter10 = cSVFormat4.printer();
        java.lang.Appendable appendable11 = cSVPrinter10.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter12 = cSVFormat0.print(appendable11);
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(true);
        java.lang.String str17 = cSVFormat14.getNullString();
        org.apache.commons.csv.CSVPrinter cSVPrinter18 = new org.apache.commons.csv.CSVPrinter(appendable11, cSVFormat14);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat19.withAutoFlush(false);
        boolean boolean23 = cSVFormat19.getTrim();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat25.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat25.withIgnoreHeaderCase();
        boolean boolean29 = cSVFormat19.equals((java.lang.Object) cSVFormat25);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat25.withNullString("\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|");
        org.apache.commons.csv.CSVPrinter cSVPrinter32 = new org.apache.commons.csv.CSVPrinter(appendable11, cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "|" + "'", str5, "|");
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVPrinter10);
        org.junit.Assert.assertNotNull(appendable11);
        org.junit.Assert.assertNotNull(cSVPrinter12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cSVFormat31);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames(false);
        boolean boolean8 = cSVFormat7.getIgnoreHeaderCase();
        java.lang.String str9 = cSVFormat7.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "," + "'", str9, ",");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSystemRecordSeparator();
        char char14 = cSVFormat13.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat15.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat16.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat23 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean24 = cSVFormat23.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat25 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat28 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat28.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withQuote(' ');
        java.lang.Object[] objArray32 = new java.lang.Object[] { cSVFormat25, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat23.withHeaderComments(objArray32);
        org.apache.commons.csv.QuoteMode quoteMode34 = cSVFormat33.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat22.withQuoteMode(quoteMode34);
        org.apache.commons.csv.CSVFormat cSVFormat36 = cSVFormat13.withQuoteMode(quoteMode34);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + ',' + "'", char14 == ',');
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertTrue("'" + quoteMode34 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode34.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat36);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.Default;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.Default + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.Default));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setDelimiter('4');
        cSVPrinter8.print((java.lang.Object) builder10);
        cSVPrinter8.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat.Builder builder16 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder16.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder16.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder16.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder16.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setIgnoreHeaderCase(true);
        java.lang.String[] strArray27 = null;
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder26.setHeader(strArray27);
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder26.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder30.setTrim(false);
        cSVPrinter8.print((java.lang.Object) false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat10);
        cSVPrinter8.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser13);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withSkipHeaderRecord(false);
        java.lang.Character char21 = cSVFormat18.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser22 = org.apache.commons.csv.CSVParser.parse("", cSVFormat18);
        java.lang.String str23 = cSVParser22.getFirstEndOfLine();
        cSVPrinter8.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser22);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNull(char21);
        org.junit.Assert.assertNotNull(cSVParser22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        boolean boolean4 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat0.withHeader(resultSet7);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        java.lang.Character char6 = cSVFormat3.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat3);
        java.lang.String str8 = cSVParser7.getTrailerComment();
        long long9 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator('a');
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withHeader(resultSet11);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote(' ');
        boolean boolean4 = cSVFormat1.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrailingDelimiter();
        char char22 = cSVFormat20.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setQuote(',');
        java.lang.Object[] objArray30 = new java.lang.Object[] { 1, cSVFormat11, false, cSVFormat24, builder29 };
        java.lang.String str31 = cSVFormat7.format(objArray30);
        java.sql.ResultSetMetaData resultSetMetaData32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat7.withHeader(resultSetMetaData32);
        java.lang.String str34 = cSVFormat7.toString();
        org.apache.commons.csv.CSVFormat cSVFormat35 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str36 = cSVFormat35.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat38 = cSVFormat35.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat35.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter41 = cSVFormat35.printer();
        java.lang.Appendable appendable42 = cSVPrinter41.getOut();
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat44.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat47 = cSVFormat45.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter48 = new org.apache.commons.csv.CSVPrinter(appendable42, cSVFormat45);
        cSVFormat4.print((java.lang.Object) cSVFormat7, appendable42, true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + ',' + "'", char22 == ',');
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false" + "'", str34, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "|" + "'", str36, "|");
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVPrinter41);
        org.junit.Assert.assertNotNull(appendable42);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat47);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse("hi!", cSVFormat2);
        java.lang.String str6 = cSVParser5.getHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVParser5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote(' ');
        java.sql.ResultSetMetaData resultSetMetaData4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSetMetaData4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withEscape('a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        org.apache.commons.csv.CSVFormat cSVFormat10 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        org.apache.commons.csv.CSVParser cSVParser13 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat10);
        cSVPrinter8.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser13);
        java.util.List<java.lang.String> strList15 = cSVParser13.getHeaderNames();
        java.util.Iterator<org.apache.commons.csv.CSVRecord> cSVRecordItor16 = cSVParser13.iterator();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream17 = cSVParser13.stream();
        java.lang.String str18 = cSVParser13.getFirstEndOfLine();
        boolean boolean19 = cSVParser13.hasTrailerComment();
        java.lang.String str20 = cSVParser13.getHeaderComment();
        java.util.Map<java.lang.String, java.lang.Integer> strMap21 = cSVParser13.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVParser13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(cSVRecordItor16);
        org.junit.Assert.assertNotNull(cSVRecordStream17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\r\n" + "'", str18, "\r\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strMap21);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat3.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withSkipHeaderRecord(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str8 = cSVFormat7.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat7.printer();
        java.lang.Appendable appendable14 = cSVPrinter13.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat3.print(appendable14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withAutoFlush(true);
        boolean boolean19 = cSVFormat18.getTrailingDelimiter();
        org.apache.commons.csv.CSVPrinter cSVPrinter20 = new org.apache.commons.csv.CSVPrinter(appendable14, cSVFormat18);
        cSVPrinter20.printComment("");
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "|" + "'", str8, "|");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(appendable14);
        org.junit.Assert.assertNotNull(cSVPrinter15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        java.lang.String[] strArray9 = cSVFormat7.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        java.lang.String[] strArray10 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder6.setHeader(strArray10);
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder6.setQuote((java.lang.Character) '4');
        org.apache.commons.csv.CSVFormat cSVFormat14 = builder6.build();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setNullString("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setCommentMarker(' ');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setQuote(' ');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.io.Reader reader0 = null;
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withSkipHeaderRecord();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser7 = new org.apache.commons.csv.CSVParser(reader0, cSVFormat6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        java.lang.String[] strArray4 = cSVFormat1.getHeaderComments();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNull(strArray4);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat0.withAllowMissingColumnNames(false);
        boolean boolean6 = cSVFormat0.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        cSVPrinter8.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter8.flush();
        cSVPrinter8.println();
        java.sql.ResultSet resultSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter8.printHeaders(resultSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat3.getQuoteMode();
        java.sql.ResultSet resultSet5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat3.withHeader(resultSet5);
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withDelimiter(' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder7.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder7.setDelimiter("|");
        java.lang.String[] strArray17 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder13.setHeader(strArray17);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder4.setHeaderComments((java.lang.Object[]) strArray17);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder4.setQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder21.setAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setEscape('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVFormat.Builder builder27 = builder23.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The delimiter cannot be a line break");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat5.builder();
        java.lang.String str7 = cSVFormat5.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withAllowMissingColumnNames(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withSkipHeaderRecord(true);
        boolean boolean4 = cSVFormat0.getAutoFlush();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAutoFlush(true);
        boolean boolean7 = cSVFormat6.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSystemRecordSeparator();
        org.apache.commons.csv.CSVPrinter cSVPrinter11 = cSVFormat9.printer();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVPrinter11);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.io.File file0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat2.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat3.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet6 = null;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withHeader(resultSet6);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withRecordSeparator("Delimiter=< > SkipHeaderRecord:false");
        boolean boolean10 = cSVFormat3.equals((java.lang.Object) cSVFormat7);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat3.withIgnoreEmptyLines();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser12 = org.apache.commons.csv.CSVParser.parse(file0, charset1, cSVFormat3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: file");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.RFC4180;
        java.sql.ResultSet resultSet1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withHeader(resultSet1);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        java.lang.Object obj9 = null;
        cSVPrinter8.print(obj9);
        org.apache.commons.csv.CSVFormat.Builder builder11 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder11.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder11.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder15.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder18 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder18.setDelimiter("|");
        java.lang.String[] strArray28 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder24.setHeader(strArray28);
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder15.setHeaderComments((java.lang.Object[]) strArray28);
        cSVPrinter8.printRecord((java.lang.Object[]) strArray28);
        org.apache.commons.csv.CSVFormat.Predefined predefined32 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        org.apache.commons.csv.CSVFormat cSVFormat33 = predefined32.getFormat();
        cSVPrinter8.print((java.lang.Object) cSVFormat33);
        cSVPrinter8.print((java.lang.Object) "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet39 = null;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat38.withHeader(resultSet39);
        org.apache.commons.csv.CSVParser cSVParser41 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat38);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator42 = cSVParser41.spliterator();
        java.lang.String str43 = cSVParser41.getTrailerComment();
        long long44 = cSVParser41.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream45 = cSVParser41.stream();
        cSVPrinter8.printRecord(cSVRecordStream45);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + predefined32 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined32.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVParser41);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordStream45);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode7 = cSVFormat6.getDuplicateHeaderMode();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode7 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL + "'", duplicateHeaderMode7.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_ALL));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAutoFlush(true);
        java.lang.String str8 = cSVFormat5.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MYSQL;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat12.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat16.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter19 = cSVFormat18.printer();
        cSVPrinter19.flush();
        cSVPrinter19.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter19.flush();
        org.apache.commons.csv.CSVFormat.Builder builder24 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder24.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder28 = builder24.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder30 = builder28.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder31 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder33 = builder31.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder35 = builder31.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder31.setDelimiter("|");
        java.lang.String[] strArray41 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder42 = builder37.setHeader(strArray41);
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder28.setHeaderComments((java.lang.Object[]) strArray41);
        cSVPrinter19.printRecords((java.lang.Object[]) strArray41);
        java.lang.String str45 = cSVFormat9.format((java.lang.Object[]) strArray41);
        java.lang.String str46 = cSVFormat5.format((java.lang.Object[]) strArray41);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVPrinter19);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|" + "'", str45, "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|" + "'", str46, "\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.apache.commons.csv.CSVFormat cSVFormat2 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.MongoDBTsv));
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withDelimiter('a');
        boolean boolean6 = cSVFormat3.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str8 = cSVFormat7.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat7.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat7.printer();
        java.lang.Appendable appendable14 = cSVPrinter13.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter15 = cSVFormat3.print(appendable14);
        org.apache.commons.csv.CSVFormat cSVFormat16 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat16.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat16.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode20 = cSVFormat19.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat19.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat23 = cSVFormat19.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter24 = new org.apache.commons.csv.CSVPrinter(appendable14, cSVFormat23);
        java.lang.Appendable appendable25 = cSVPrinter24.getOut();
        java.lang.Appendable appendable26 = cSVPrinter24.getOut();
        org.apache.commons.csv.CSVFormat cSVFormat27 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat27.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat30 = cSVFormat27.withAutoFlush(false);
        boolean boolean31 = cSVFormat27.getTrim();
        java.lang.Object[] objArray32 = null;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat27.withHeaderComments(objArray32);
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat27.withRecordSeparator("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.apache.commons.csv.CSVPrinter cSVPrinter36 = new org.apache.commons.csv.CSVPrinter(appendable26, cSVFormat35);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "|" + "'", str8, "|");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(appendable14);
        org.junit.Assert.assertNotNull(cSVPrinter15);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertTrue("'" + quoteMode20 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode20.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat23);
        org.junit.Assert.assertNotNull(appendable25);
        org.junit.Assert.assertNotNull(appendable26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        boolean boolean2 = cSVFormat0.isQuoteCharacterSet();
        boolean boolean3 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat.Builder builder4 = cSVFormat0.builder();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.lang.String str6 = cSVParser4.getTrailerComment();
        boolean boolean7 = cSVParser4.hasTrailerComment();
        long long8 = cSVParser4.getRecordNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat1.withQuote(' ');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat1.withRecordSeparator('a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat1.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord(false);
        java.lang.Character char6 = cSVFormat3.getCommentMarker();
        org.apache.commons.csv.CSVParser cSVParser7 = org.apache.commons.csv.CSVParser.parse("", cSVFormat3);
        java.lang.String str8 = cSVParser7.getTrailerComment();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream9 = cSVParser7.stream();
        long long10 = cSVParser7.getCurrentLineNumber();
        long long11 = cSVParser7.getCurrentLineNumber();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVParser7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVRecordStream9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withRecordSeparator('#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withCommentMarker(' ');
        java.sql.ResultSet resultSet11 = null;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withHeader(resultSet11);
        java.lang.String str13 = cSVFormat12.getDelimiterString();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setAutoFlush(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder2.setQuote('#');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setIgnoreHeaderCase(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat cSVFormat9 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode13 = cSVFormat12.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder2.setQuoteMode(quoteMode13);
        java.sql.ResultSetMetaData resultSetMetaData15 = null;
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setHeader(resultSetMetaData15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertTrue("'" + quoteMode13 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode13.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withEscape((java.lang.Character) ' ');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(',');
        boolean boolean2 = cSVFormat1.isEscapeCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat2.withCommentMarker((java.lang.Character) 'a');
        java.io.File file7 = null;
        java.nio.charset.Charset charset8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVPrinter cSVPrinter9 = cSVFormat2.print(file7, charset8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        java.lang.String[] strArray11 = null;
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setHeader(strArray11);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat18.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat18.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat22.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter25 = cSVFormat24.printer();
        cSVPrinter25.flush();
        cSVPrinter25.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter25.flush();
        org.apache.commons.csv.CSVFormat.Builder builder30 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder30.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder30.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder34.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder37 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder37.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder37.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder43 = builder37.setDelimiter("|");
        java.lang.String[] strArray47 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder43.setHeader(strArray47);
        org.apache.commons.csv.CSVFormat.Builder builder49 = builder34.setHeaderComments((java.lang.Object[]) strArray47);
        cSVPrinter25.printRecords((java.lang.Object[]) strArray47);
        org.apache.commons.csv.CSVFormat.Builder builder51 = builder14.setHeader(strArray47);
        org.apache.commons.csv.CSVFormat.Builder builder53 = builder51.setAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVPrinter25);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        cSVPrinter8.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter8.flush();
        java.sql.ResultSet resultSet13 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter8.printRecords(resultSet13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder7.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder7.setDelimiter("|");
        java.lang.String[] strArray17 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder13.setHeader(strArray17);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder4.setHeaderComments((java.lang.Object[]) strArray17);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder4.setQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder21.setAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setEscape('#');
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder23.setEscape((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.lang.String str6 = cSVParser4.getTrailerComment();
        long long7 = cSVParser4.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream8 = cSVParser4.stream();
        java.util.Map<java.lang.String, java.lang.Integer> strMap9 = cSVParser4.getHeaderMap();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordStream8);
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat.Builder builder12 = cSVFormat10.builder();
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setEscape('a');
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setCommentMarker('4');
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder14.setAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean2 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote(' ');
        java.lang.Object[] objArray10 = new java.lang.Object[] { cSVFormat3, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat1.withHeaderComments(objArray10);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withCommentMarker((java.lang.Character) 'a');
        boolean boolean17 = cSVFormat14.isNullStringSet();
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",\"Delimiter=<,> Escape=<\"\"> QuoteChar=<\"\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false\",|", cSVFormat14);
        java.util.List<java.lang.String> strList19 = cSVParser18.getHeaderNames();
        boolean boolean20 = cSVParser18.isClosed();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder7 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder9 = builder7.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder11 = builder7.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder13 = builder7.setDelimiter("|");
        java.lang.String[] strArray17 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder13.setHeader(strArray17);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder4.setHeaderComments((java.lang.Object[]) strArray17);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder4.setQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder23 = builder21.setAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat.Builder builder25 = builder23.setEscape('#');
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat26.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat29 = cSVFormat26.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat29.withAllowDuplicateHeaderNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder32 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder34 = builder32.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData35 = null;
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder34.setHeader(resultSetMetaData35);
        org.apache.commons.csv.CSVFormat.Builder builder38 = builder34.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat39 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat40 = cSVFormat39.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat39.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode43 = cSVFormat42.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder44 = builder38.setQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat cSVFormat45 = cSVFormat29.withQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat.Builder builder46 = builder25.setQuoteMode(quoteMode43);
        org.apache.commons.csv.CSVFormat.Builder builder48 = builder25.setIgnoreEmptyLines(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVFormat29);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertTrue("'" + quoteMode43 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode43.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat10.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat12.withSystemRecordSeparator();
        boolean boolean14 = cSVFormat13.isQuoteCharacterSet();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withSkipHeaderRecord();
        java.lang.Character char6 = cSVFormat4.getCommentMarker();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat4.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withIgnoreHeaderCase();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNull(char6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAutoFlush(true);
        boolean boolean7 = cSVFormat6.isNullStringSet();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSystemRecordSeparator();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        boolean boolean9 = cSVFormat7.getAllowDuplicateHeaderNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.TDF;
        java.lang.Character char1 = cSVFormat0.getEscapeCharacter();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withRecordSeparator("");
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSet4);
        java.lang.String str6 = cSVFormat5.toString();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat5.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat8.withAutoFlush(true);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNull(char1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false" + "'", str6, "Delimiter=<\t> QuoteChar=<\"> RecordSeparator=<> EmptyLines:ignored SurroundingSpaces:ignored SkipHeaderRecord:false");
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder2.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setTrailingDelimiter(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setDelimiter('4');
        cSVPrinter8.print((java.lang.Object) builder10);
        org.apache.commons.csv.CSVFormat cSVFormat15 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet16 = null;
        org.apache.commons.csv.CSVFormat cSVFormat17 = cSVFormat15.withHeader(resultSet16);
        org.apache.commons.csv.CSVParser cSVParser18 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat15);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator19 = cSVParser18.spliterator();
        java.lang.String str20 = cSVParser18.getTrailerComment();
        long long21 = cSVParser18.getCurrentLineNumber();
        cSVPrinter8.printRecord((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser18);
        cSVPrinter8.printComment("|");
        org.apache.commons.csv.CSVFormat cSVFormat26 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet27 = null;
        org.apache.commons.csv.CSVFormat cSVFormat28 = cSVFormat26.withHeader(resultSet27);
        org.apache.commons.csv.CSVParser cSVParser29 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat26);
        java.lang.String str30 = cSVParser29.getHeaderComment();
        cSVPrinter8.printRecords((java.lang.Iterable<org.apache.commons.csv.CSVRecord>) cSVParser29);
        org.apache.commons.csv.CSVFormat cSVFormat32 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat33 = cSVFormat32.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat35 = cSVFormat32.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode36 = cSVFormat35.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat37 = cSVFormat35.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat38 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat39 = cSVFormat38.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat41 = cSVFormat39.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat43 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat43.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat45 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat46 = cSVFormat45.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat48 = cSVFormat46.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat50 = cSVFormat46.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat51 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat52 = cSVFormat51.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat53 = cSVFormat52.withTrailingDelimiter();
        char char54 = cSVFormat52.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat56 = cSVFormat52.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder57 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder59 = builder57.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder61 = builder57.setQuote(',');
        java.lang.Object[] objArray62 = new java.lang.Object[] { 1, cSVFormat43, false, cSVFormat56, builder61 };
        java.lang.String str63 = cSVFormat39.format(objArray62);
        org.apache.commons.csv.CSVFormat cSVFormat64 = cSVFormat37.withHeaderComments(objArray62);
        cSVPrinter8.printRecord(objArray62);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(cSVFormat15);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVParser18);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(cSVFormat26);
        org.junit.Assert.assertNotNull(cSVFormat28);
        org.junit.Assert.assertNotNull(cSVParser29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat33);
        org.junit.Assert.assertNotNull(cSVFormat35);
        org.junit.Assert.assertTrue("'" + quoteMode36 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode36.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat37);
        org.junit.Assert.assertNotNull(cSVFormat38);
        org.junit.Assert.assertNotNull(cSVFormat39);
        org.junit.Assert.assertNotNull(cSVFormat41);
        org.junit.Assert.assertNotNull(cSVFormat43);
        org.junit.Assert.assertNotNull(cSVFormat44);
        org.junit.Assert.assertNotNull(cSVFormat45);
        org.junit.Assert.assertNotNull(cSVFormat46);
        org.junit.Assert.assertNotNull(cSVFormat48);
        org.junit.Assert.assertNotNull(cSVFormat50);
        org.junit.Assert.assertNotNull(cSVFormat51);
        org.junit.Assert.assertNotNull(cSVFormat52);
        org.junit.Assert.assertNotNull(cSVFormat53);
        org.junit.Assert.assertTrue("'" + char54 + "' != '" + ',' + "'", char54 == ',');
        org.junit.Assert.assertNotNull(cSVFormat56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(cSVFormat64);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withAutoFlush(true);
        boolean boolean7 = cSVFormat6.isQuoteCharacterSet();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat6.withQuote((java.lang.Character) '#');
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat9.withSystemRecordSeparator();
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat9.withIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withAutoFlush(true);
        java.lang.String str8 = cSVFormat5.getNullString();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withAutoFlush(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat(' ');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withAllowMissingColumnNames(true);
        boolean boolean4 = cSVFormat3.getTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder0.setNullString("");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setIgnoreHeaderCase(true);
        java.lang.String[] strArray11 = null;
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setHeader(strArray11);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder10.setDelimiter("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setQuote((java.lang.Character) '4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withTrailingDelimiter(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat4.withIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withIgnoreHeaderCase(true);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withEscape((java.lang.Character) 'a');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD_CSV;
        org.apache.commons.csv.CSVFormat.Builder builder1 = cSVFormat0.builder();
        org.apache.commons.csv.CSVFormat.Builder builder3 = builder1.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|");
        org.apache.commons.csv.CSVFormat.Builder builder4 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setHeader(resultSetMetaData7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder6.setRecordSeparator("|");
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder6.setQuote('#');
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setIgnoreHeaderCase(true);
        org.apache.commons.csv.DuplicateHeaderMode duplicateHeaderMode17 = org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY;
        org.apache.commons.csv.CSVFormat.Builder builder18 = builder14.setDuplicateHeaderMode(duplicateHeaderMode17);
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder1.setDuplicateHeaderMode(duplicateHeaderMode17);
        org.apache.commons.csv.CSVFormat.Builder builder21 = builder19.setIgnoreHeaderCase(false);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + duplicateHeaderMode17 + "' != '" + org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY + "'", duplicateHeaderMode17.equals(org.apache.commons.csv.DuplicateHeaderMode.ALLOW_EMPTY));
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withQuote('a');
        org.apache.commons.csv.QuoteMode quoteMode4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuoteMode(quoteMode4);
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat1.withFirstRecordAsHeader();
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withHeader(resultSet7);
        java.lang.String[] strArray9 = cSVFormat8.getHeader();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withQuote((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat cSVFormat12 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat12.withRecordSeparator(' ');
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(false);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str18 = cSVFormat17.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat19 = cSVFormat17.withIgnoreHeaderCase();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat17.withNullString("");
        org.apache.commons.csv.CSVFormat cSVFormat22 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str23 = cSVFormat22.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat25 = cSVFormat22.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat27 = cSVFormat22.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter28 = cSVFormat22.printer();
        java.lang.Appendable appendable29 = cSVPrinter28.getOut();
        org.apache.commons.csv.CSVFormat cSVFormat30 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat31 = cSVFormat30.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat31.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat32.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter35 = new org.apache.commons.csv.CSVPrinter(appendable29, cSVFormat32);
        cSVFormat14.print((java.lang.Object) "", appendable29, false);
        org.apache.commons.csv.CSVPrinter cSVPrinter38 = cSVFormat11.print(appendable29);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNull(strArray9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "|" + "'", str18, "|");
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "|" + "'", str23, "|");
        org.junit.Assert.assertNotNull(cSVFormat25);
        org.junit.Assert.assertNotNull(cSVFormat27);
        org.junit.Assert.assertNotNull(cSVPrinter28);
        org.junit.Assert.assertNotNull(appendable29);
        org.junit.Assert.assertNotNull(cSVFormat30);
        org.junit.Assert.assertNotNull(cSVFormat31);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
        org.junit.Assert.assertNotNull(cSVPrinter38);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean1 = cSVFormat0.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withQuote(' ');
        java.lang.Object[] objArray9 = new java.lang.Object[] { cSVFormat2, 100.0d, 10L, ' ' };
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat0.withHeaderComments(objArray9);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        char char12 = cSVFormat10.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat10.withAllowDuplicateHeaderNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat15 = cSVFormat14.withIgnoreHeaderCase();
        java.io.Reader reader16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser17 = cSVFormat14.parse(reader16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ',' + "'", char12 == ',');
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat15);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        java.io.Reader reader4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = cSVFormat0.parse(reader4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reader");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setRecordSeparator('a');
        java.sql.ResultSet resultSet7 = null;
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setHeader(resultSet7);
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder8.setTrailingDelimiter(true);
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setQuote('\"');
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder12.setNullString("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> CommentStart=<a> RecordSeparator=<\n> EmptyLines:ignored IgnoreHeaderCase:ignored SkipHeaderRecord:false HeaderComments:[Delimiter=<|> Escape=<\\> QuoteChar=<\"> RecordSeparator=<\n> EmptyLines:ignored SkipHeaderRecord:false, 100.0, 10,  ]");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        cSVPrinter8.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter8.flush();
        org.apache.commons.csv.CSVFormat.Builder builder13 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder15 = builder13.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder17 = builder13.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder19 = builder17.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder20 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder20.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder20.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder26 = builder20.setDelimiter("|");
        java.lang.String[] strArray30 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder26.setHeader(strArray30);
        org.apache.commons.csv.CSVFormat.Builder builder32 = builder17.setHeaderComments((java.lang.Object[]) strArray30);
        cSVPrinter8.printRecords((java.lang.Object[]) strArray30);
        java.sql.ResultSet resultSet34 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter8.printHeaders(resultSet34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        boolean boolean4 = cSVFormat0.getTrim();
        java.lang.Object[] objArray5 = null;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withHeaderComments(objArray5);
        java.lang.String[] strArray7 = cSVFormat6.getHeader();
        java.lang.String str8 = cSVFormat6.getDelimiterString();
        boolean boolean9 = cSVFormat6.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.net.URL uRL0 = null;
        java.nio.charset.Charset charset1 = null;
        org.apache.commons.csv.CSVFormat cSVFormat2 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withIgnoreHeaderCase(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.csv.CSVParser cSVParser5 = org.apache.commons.csv.CSVParser.parse(uRL0, charset1, cSVFormat4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: url");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        boolean boolean2 = cSVFormat1.getIgnoreEmptyLines();
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat1.withNullString("hi!");
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat4.withDelimiter('a');
        boolean boolean7 = cSVFormat4.getIgnoreSurroundingSpaces();
        org.apache.commons.csv.CSVFormat cSVFormat8 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str9 = cSVFormat8.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat8.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat13 = cSVFormat8.withDelimiter('4');
        org.apache.commons.csv.CSVPrinter cSVPrinter14 = cSVFormat8.printer();
        java.lang.Appendable appendable15 = cSVPrinter14.getOut();
        org.apache.commons.csv.CSVPrinter cSVPrinter16 = cSVFormat4.print(appendable15);
        org.apache.commons.csv.CSVFormat cSVFormat17 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat17.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat17.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode21 = cSVFormat20.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat22 = cSVFormat20.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withIgnoreSurroundingSpaces(true);
        org.apache.commons.csv.CSVPrinter cSVPrinter25 = new org.apache.commons.csv.CSVPrinter(appendable15, cSVFormat24);
        org.apache.commons.csv.CSVParser cSVParser26 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\tDelimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\\r\\n> EmptyLines:ignored SkipHeaderRecord:false\t|", cSVFormat24);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator27 = cSVParser26.spliterator();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(cSVFormat4);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "|" + "'", str9, "|");
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVPrinter14);
        org.junit.Assert.assertNotNull(appendable15);
        org.junit.Assert.assertNotNull(cSVPrinter16);
        org.junit.Assert.assertNotNull(cSVFormat17);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertTrue("'" + quoteMode21 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode21.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat22);
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(cSVParser26);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator27);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setSkipHeaderRecord(false);
        java.sql.ResultSetMetaData resultSetMetaData3 = null;
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setHeader(resultSetMetaData3);
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder2.setAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat7 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat7.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode11 = cSVFormat10.getQuoteMode();
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder6.setQuoteMode(quoteMode11);
        org.apache.commons.csv.CSVFormat.Builder builder14 = builder6.setQuote(',');
        java.sql.ResultSetMetaData resultSetMetaData15 = null;
        org.apache.commons.csv.CSVFormat.Builder builder16 = builder14.setHeader(resultSetMetaData15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertTrue("'" + quoteMode11 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode11.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat3.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord();
        boolean boolean6 = cSVFormat3.getTrim();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter8 = cSVFormat7.printer();
        cSVPrinter8.flush();
        org.apache.commons.csv.CSVFormat.Builder builder10 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder10.setDelimiter('4');
        cSVPrinter8.print((java.lang.Object) builder10);
        java.sql.ResultSet resultSet14 = null;
        // The following exception was thrown during execution in test generation
        try {
            cSVPrinter8.printRecords(resultSet14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVPrinter8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.INFORMIX_UNLOAD;
        java.lang.String str1 = cSVFormat0.getDelimiterString();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat0.withIgnoreHeaderCase();
        org.apache.commons.csv.QuoteMode quoteMode3 = org.apache.commons.csv.QuoteMode.MINIMAL;
        org.apache.commons.csv.CSVFormat cSVFormat4 = cSVFormat2.withQuoteMode(quoteMode3);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + quoteMode3 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode3.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat4);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder6 = cSVFormat5.builder();
        java.lang.String str7 = cSVFormat5.getNullString();
        boolean boolean8 = cSVFormat5.getAllowDuplicateHeaderNames();
        boolean boolean9 = cSVFormat5.getIgnoreHeaderCase();
        java.sql.ResultSetMetaData resultSetMetaData10 = null;
        org.apache.commons.csv.CSVFormat cSVFormat11 = cSVFormat5.withHeader(resultSetMetaData10);
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cSVFormat11);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.newFormat('a');
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withEscape('\"');
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setCommentMarker((java.lang.Character) '\"');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder4.setEscape('#');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.commons.csv.CSVFormat.Predefined predefined0 = org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText;
        org.apache.commons.csv.CSVFormat cSVFormat1 = predefined0.getFormat();
        org.junit.Assert.assertTrue("'" + predefined0 + "' != '" + org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText + "'", predefined0.equals(org.apache.commons.csv.CSVFormat.Predefined.PostgreSQLText));
        org.junit.Assert.assertNotNull(cSVFormat1);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat12.printer();
        cSVPrinter13.flush();
        cSVPrinter13.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter13.flush();
        org.apache.commons.csv.CSVFormat.Builder builder18 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder25 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder25.setDelimiter("|");
        java.lang.String[] strArray35 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder31.setHeader(strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder22.setHeaderComments((java.lang.Object[]) strArray35);
        cSVPrinter13.printRecords((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder2.setHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder41 = builder39.setTrailingDelimiter(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        boolean boolean4 = cSVFormat0.getTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat0.withAllowMissingColumnNames(false);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat0.withTrailingDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat7.withFirstRecordAsHeader();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat8);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrim();
        org.apache.commons.csv.CSVFormat cSVFormat3 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet4 = null;
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withHeader(resultSet4);
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat5.withRecordSeparator("Delimiter=< > SkipHeaderRecord:false");
        boolean boolean8 = cSVFormat1.equals((java.lang.Object) cSVFormat5);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat5.withTrailingDelimiter();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cSVFormat9);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.commons.csv.CSVFormat cSVFormat1 = org.apache.commons.csv.CSVFormat.MYSQL;
        java.sql.ResultSet resultSet2 = null;
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat1.withHeader(resultSet2);
        org.apache.commons.csv.CSVParser cSVParser4 = org.apache.commons.csv.CSVParser.parse("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", cSVFormat1);
        java.util.Spliterator<org.apache.commons.csv.CSVRecord> cSVRecordSpliterator5 = cSVParser4.spliterator();
        java.lang.String str6 = cSVParser4.getTrailerComment();
        long long7 = cSVParser4.getCurrentLineNumber();
        java.util.stream.Stream<org.apache.commons.csv.CSVRecord> cSVRecordStream8 = cSVParser4.stream();
        long long9 = cSVParser4.getRecordNumber();
        boolean boolean10 = cSVParser4.hasHeaderComment();
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertNotNull(cSVParser4);
        org.junit.Assert.assertNotNull(cSVRecordSpliterator5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(cSVRecordStream8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder0.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder6 = builder0.setDelimiter("|");
        org.apache.commons.csv.CSVFormat.Builder builder8 = builder6.setNullString("|");
        org.apache.commons.csv.CSVFormat.Builder builder10 = builder6.setCommentMarker(' ');
        org.apache.commons.csv.CSVFormat.Builder builder12 = builder6.setAllowMissingColumnNames(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.commons.csv.CSVFormat.Builder builder0 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder2 = builder0.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder4 = builder2.setIgnoreSurroundingSpaces(false);
        org.apache.commons.csv.CSVFormat cSVFormat5 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat6 = cSVFormat5.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat8 = cSVFormat6.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat10 = cSVFormat6.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat10.withCommentMarker((java.lang.Character) '4');
        org.apache.commons.csv.CSVPrinter cSVPrinter13 = cSVFormat12.printer();
        cSVPrinter13.flush();
        cSVPrinter13.printComment("Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false");
        cSVPrinter13.flush();
        org.apache.commons.csv.CSVFormat.Builder builder18 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder20 = builder18.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder22 = builder18.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder24 = builder22.setRecordSeparator('a');
        org.apache.commons.csv.CSVFormat.Builder builder25 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setQuote(',');
        org.apache.commons.csv.CSVFormat.Builder builder31 = builder25.setDelimiter("|");
        java.lang.String[] strArray35 = new java.lang.String[] { "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "Delimiter=<,> Escape=<\"> QuoteChar=<\"> QuoteMode=<MINIMAL> RecordSeparator=<\r\n> EmptyLines:ignored SkipHeaderRecord:false", "|" };
        org.apache.commons.csv.CSVFormat.Builder builder36 = builder31.setHeader(strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder37 = builder22.setHeaderComments((java.lang.Object[]) strArray35);
        cSVPrinter13.printRecords((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat.Builder builder39 = builder2.setHeaderComments((java.lang.Object[]) strArray35);
        org.apache.commons.csv.CSVFormat cSVFormat40 = builder39.build();
        org.apache.commons.csv.CSVFormat cSVFormat42 = cSVFormat40.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat cSVFormat44 = cSVFormat40.withIgnoreSurroundingSpaces(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat8);
        org.junit.Assert.assertNotNull(cSVFormat10);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVPrinter13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(cSVFormat40);
        org.junit.Assert.assertNotNull(cSVFormat42);
        org.junit.Assert.assertNotNull(cSVFormat44);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter();
        char char3 = cSVFormat1.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat1.withQuote((java.lang.Character) 'a');
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat1.withTrim(false);
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withIgnoreSurroundingSpaces(true);
        boolean boolean10 = cSVFormat9.getAllowMissingColumnNames();
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ',' + "'", char3 == ',');
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.commons.csv.CSVFormat cSVFormat0 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat3 = cSVFormat0.withAutoFlush(false);
        org.apache.commons.csv.QuoteMode quoteMode4 = cSVFormat3.getQuoteMode();
        org.apache.commons.csv.CSVFormat cSVFormat5 = cSVFormat3.withSkipHeaderRecord();
        org.apache.commons.csv.CSVFormat cSVFormat6 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat7 = cSVFormat6.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat9 = cSVFormat7.withQuote('a');
        org.apache.commons.csv.CSVFormat cSVFormat11 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat12 = cSVFormat11.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat13 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat14 = cSVFormat13.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat16 = cSVFormat14.withSkipHeaderRecord(true);
        org.apache.commons.csv.CSVFormat cSVFormat18 = cSVFormat14.withIgnoreHeaderCase(false);
        org.apache.commons.csv.CSVFormat cSVFormat19 = org.apache.commons.csv.CSVFormat.MONGODB_CSV;
        org.apache.commons.csv.CSVFormat cSVFormat20 = cSVFormat19.withAllowMissingColumnNames();
        org.apache.commons.csv.CSVFormat cSVFormat21 = cSVFormat20.withTrailingDelimiter();
        char char22 = cSVFormat20.getDelimiter();
        org.apache.commons.csv.CSVFormat cSVFormat24 = cSVFormat20.withAllowMissingColumnNames(true);
        org.apache.commons.csv.CSVFormat.Builder builder25 = org.apache.commons.csv.CSVFormat.Builder.create();
        org.apache.commons.csv.CSVFormat.Builder builder27 = builder25.setNullString("hi!");
        org.apache.commons.csv.CSVFormat.Builder builder29 = builder25.setQuote(',');
        java.lang.Object[] objArray30 = new java.lang.Object[] { 1, cSVFormat11, false, cSVFormat24, builder29 };
        java.lang.String str31 = cSVFormat7.format(objArray30);
        org.apache.commons.csv.CSVFormat cSVFormat32 = cSVFormat5.withHeaderComments(objArray30);
        org.apache.commons.csv.CSVFormat cSVFormat34 = cSVFormat5.withDelimiter('4');
        org.junit.Assert.assertNotNull(cSVFormat0);
        org.junit.Assert.assertNotNull(cSVFormat1);
        org.junit.Assert.assertNotNull(cSVFormat3);
        org.junit.Assert.assertTrue("'" + quoteMode4 + "' != '" + org.apache.commons.csv.QuoteMode.MINIMAL + "'", quoteMode4.equals(org.apache.commons.csv.QuoteMode.MINIMAL));
        org.junit.Assert.assertNotNull(cSVFormat5);
        org.junit.Assert.assertNotNull(cSVFormat6);
        org.junit.Assert.assertNotNull(cSVFormat7);
        org.junit.Assert.assertNotNull(cSVFormat9);
        org.junit.Assert.assertNotNull(cSVFormat11);
        org.junit.Assert.assertNotNull(cSVFormat12);
        org.junit.Assert.assertNotNull(cSVFormat13);
        org.junit.Assert.assertNotNull(cSVFormat14);
        org.junit.Assert.assertNotNull(cSVFormat16);
        org.junit.Assert.assertNotNull(cSVFormat18);
        org.junit.Assert.assertNotNull(cSVFormat19);
        org.junit.Assert.assertNotNull(cSVFormat20);
        org.junit.Assert.assertNotNull(cSVFormat21);
        org.junit.Assert.assertTrue("'" + char22 + "' != '" + ',' + "'", char22 == ',');
        org.junit.Assert.assertNotNull(cSVFormat24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(cSVFormat32);
        org.junit.Assert.assertNotNull(cSVFormat34);
    }
}

