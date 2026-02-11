
PN = "perl-XML-Simple"
PE = "0"
PV = "2.25"
PR = "22.el10"
PACKAGES = "perl-XML-Simple perl-XML-Simple-tests"


URI_perl-XML-Simple = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-XML-Simple-2.25-22.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-Simple = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(File::Spec) ( ) perl(File::Basename) ( ) perl(Scalar::Util) ( ) perl(IO::Handle) ( ) perl(warnings::register) ( ) perl(Storable) ( ) perl(XML::Parser) ( ) perl(XML::NamespaceSupport) ( >=  1.04) perl(XML::SAX) ( >=  0.15)"
RPROVIDES:perl-XML-Simple = "perl(XML::Simple) ( =  2.25) perl-XML-Simple ( =  2.25-22.el10)"

URI_perl-XML-Simple-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XML-Simple-tests-2.25-22.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-XML-Simple-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(vars) ( ) perl(File::Temp) ( ) perl(base) ( ) perl(IO::File) ( ) perl(FileHandle) ( ) perl(XML::SAX::Base) ( ) perl(XML::Simple) ( ) perl-XML-Simple ( =  2.25-22.el10)"
RPROVIDES:perl-XML-Simple-tests = "perl-XML-Simple-tests ( =  2.25-22.el10)"
