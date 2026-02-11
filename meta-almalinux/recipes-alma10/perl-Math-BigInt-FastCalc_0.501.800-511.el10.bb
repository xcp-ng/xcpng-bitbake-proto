
PN = "perl-Math-BigInt-FastCalc"
PE = "0"
PV = "0.501.800"
PR = "511.el10"
PACKAGES = "perl-Math-BigInt-FastCalc perl-Math-BigInt-FastCalc-tests"


URI_perl-Math-BigInt-FastCalc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Math-BigInt-FastCalc-0.501.800-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Math-BigInt-FastCalc = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(:VERSION) ( >=  5.6.1) perl(Math::BigInt::Calc) ( >=  1.999801)"
RPROVIDES:perl-Math-BigInt-FastCalc = "perl(Math::BigInt::FastCalc) ( =  0.5018) perl-Math-BigInt-FastCalc ( =  0.501.800-511.el10) perl-Math-BigInt-FastCalc(x86-64) ( =  0.501.800-511.el10)"

URI_perl-Math-BigInt-FastCalc-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Math-BigInt-FastCalc-tests-0.501.800-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Math-BigInt-FastCalc-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Exporter) ( ) perl(Math::BigInt) ( ) perl(Math::BigFloat) ( ) perl(Math::BigInt::FastCalc) ( ) perl-Math-BigInt-FastCalc ( =  0.501.800-511.el10) perl(Math::BigInt) ( >=  2.003001)"
RPROVIDES:perl-Math-BigInt-FastCalc-tests = "perl-Math-BigInt-FastCalc-tests ( =  0.501.800-511.el10) perl-Math-BigInt-FastCalc-tests(x86-64) ( =  0.501.800-511.el10)"
