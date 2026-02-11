
PN = "perl-Math-BigInt-GMP"
PE = "0"
PV = "1.7001"
PR = "5.el10"
PACKAGES = "perl-Math-BigInt-GMP perl-Math-BigInt-GMP-tests"


URI_perl-Math-BigInt-GMP = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Math-BigInt-GMP-1.7001-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Math-BigInt-GMP = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl(warnings) ( ) perl-libs ( ) perl(XSLoader) ( ) libgmp.so.10()(64bit) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) libperl.so.5.40()(64bit) ( ) perl(:VERSION) ( >=  5.8.0) perl(Math::BigInt::Lib) ( >=  1.999801)"
RPROVIDES:perl-Math-BigInt-GMP = "perl-Math-BigInt-GMP ( =  1.7001-5.el10) perl(Math::BigInt::GMP) ( =  1.7001) perl-Math-BigInt-GMP(x86-64) ( =  1.7001-5.el10)"

URI_perl-Math-BigInt-GMP-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Math-BigInt-GMP-tests-1.7001-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Math-BigInt-GMP-tests = "perl(strict) ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(threads) ( ) perl(Math::BigInt) ( ) perl-Math-BigInt-GMP ( =  1.7001-5.el10) perl(Math::BigInt) ( >=  1.999840)"
RPROVIDES:perl-Math-BigInt-GMP-tests = "perl-Math-BigInt-GMP-tests ( =  1.7001-5.el10) perl-Math-BigInt-GMP-tests(x86-64) ( =  1.7001-5.el10)"
