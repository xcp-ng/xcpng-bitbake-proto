
PN = "perl-Sub-Quote"
PE = "0"
PV = "2.006008"
PR = "6.el10"
PACKAGES = "perl-Sub-Quote perl-Sub-Quote-tests"


URI_perl-Sub-Quote = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sub-Quote-2.006008-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Quote = "perl(strict) ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl-libs ( ) perl(Scalar::Util) ( ) perl(Sub::Defer) ( ) perl(XString) ( >=  0.003)"
RPROVIDES:perl-Sub-Quote = "perl-Sub-Quote ( =  2.006008-6.el10) perl(Sub::Defer) ( =  2.006008) perl(Sub::Quote) ( =  2.006008)"

URI_perl-Sub-Quote-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Sub-Quote-tests-2.006008-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Sub-Quote-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(Data::Dumper) ( ) perl(overload) ( ) perl(constant) ( ) perl(Scalar::Util) ( ) perl(threads) ( ) perl(B) ( ) perl(List::Util) ( ) perl(Test::Builder) ( ) perl(Sub::Defer) ( ) perl(Sub::Quote) ( ) perl-Sub-Quote ( =  2.006008-6.el10)"
RPROVIDES:perl-Sub-Quote-tests = "perl-Sub-Quote-tests ( =  2.006008-6.el10)"
