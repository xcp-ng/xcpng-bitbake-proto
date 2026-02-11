
PN = "perl-Convert-ASN1"
PE = "0"
PV = "0.34"
PR = "5.el10"
PACKAGES = "perl-Convert-ASN1 perl-Convert-ASN1-tests"


URI_perl-Convert-ASN1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Convert-ASN1-0.34-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Convert-ASN1 = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(constant) ( ) perl(POSIX) ( ) perl(Encode) ( ) perl(Socket) ( ) perl(Time::Local) ( ) perl(utf8) ( ) perl(Convert::ASN1) ( ) perl(:VERSION) ( >=  5.4.0)"
RPROVIDES:perl-Convert-ASN1 = "perl(Convert::ASN1) ( =  0.34) perl(Convert::ASN1::parser) ( =  0.34) perl-Convert-ASN1 ( =  0.34-5.el10)"

URI_perl-Convert-ASN1-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Convert-ASN1-tests-0.34-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Convert-ASN1-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(File::Temp) ( ) perl(Data::Dumper) ( ) perl(POSIX) ( ) perl(IO::Socket) ( ) perl(Convert::ASN1) ( ) perl-Convert-ASN1 ( =  0.34-5.el10) perl(Math::BigInt) ( >=  1.997)"
RPROVIDES:perl-Convert-ASN1-tests = "perl-Convert-ASN1-tests ( =  0.34-5.el10)"
