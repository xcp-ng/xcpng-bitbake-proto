
PN = "perl-bignum"
PE = "0"
PV = "0.67"
PR = "512.el10"
PACKAGES = "perl-bignum perl-bignum-tests"


URI_perl-bignum = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-bignum-0.67-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-bignum = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(constant) ( ) perl(overload) ( ) perl(Math::BigFloat) ( ) perl(Carp) ( >=  1.22) perl(Math::BigInt) ( >=  1.999830) perl(Math::BigRat) ( >=  0.2623)"
RPROVIDES:perl-bignum = "perl(Math::BigFloat::Trace) ( =  0.67) perl(Math::BigInt::Trace) ( =  0.67) perl(Math::BigRat::Trace) ( =  0.67) perl(bigfloat) ( =  0.67) perl(bigint) ( =  0.67) perl(bignum) ( =  0.67) perl(bigrat) ( =  0.67) perl-bignum ( =  0.67-512.el10)"

URI_perl-bignum-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-bignum-tests-0.67-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-bignum-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(bigint) ( ) perl(Math::BigInt::GMP) ( ) perl(bigfloat) ( ) perl(bignum) ( ) perl(bigrat) ( ) perl-bignum ( =  0.67-512.el10)"
RPROVIDES:perl-bignum-tests = "perl-bignum-tests ( =  0.67-512.el10)"
