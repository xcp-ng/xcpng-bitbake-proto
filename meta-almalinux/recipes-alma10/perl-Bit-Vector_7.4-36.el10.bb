
PN = "perl-Bit-Vector"
PE = "0"
PV = "7.4"
PR = "36.el10"
PACKAGES = "perl-Bit-Vector perl-Bit-Vector-tests"


URI_perl-Bit-Vector = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Bit-Vector-7.4-36.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Bit-Vector = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(overload) ( ) perl(DynaLoader) ( ) perl(Carp::Clan) ( >=  5.3) perl(Storable) ( >=  2.21)"
RPROVIDES:perl-Bit-Vector = "perl(Bit::Vector) ( =  7.4) perl(Bit::Vector::Overload) ( =  7.4) perl(Bit::Vector::String) ( =  7.4) perl-Bit-Vector ( =  7.4-36.el10) perl-Bit-Vector(x86-64) ( =  7.4-36.el10)"

URI_perl-Bit-Vector-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Bit-Vector-tests-7.4-36.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Bit-Vector-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) /usr/bin/bash ( ) perl(integer) ( ) perl(Bit::Vector) ( ) perl(Bit::Vector::Overload) ( ) perl(Bit::Vector::String) ( ) perl-Bit-Vector ( =  7.4-36.el10)"
RPROVIDES:perl-Bit-Vector-tests = "perl-Bit-Vector-tests ( =  7.4-36.el10) perl-Bit-Vector-tests(x86-64) ( =  7.4-36.el10)"
