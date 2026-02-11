
PN = "perl-Devel-Size"
PE = "0"
PV = "0.84"
PR = "3.el10"
PACKAGES = "perl-Devel-Size perl-Devel-Size-tests"


URI_perl-Devel-Size = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Devel-Size-0.84-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Devel-Size = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) perl(:VERSION) ( >=  5.5.0)"
RPROVIDES:perl-Devel-Size = "perl(Devel::Size) ( =  0.84) perl-Devel-Size ( =  0.84-3.el10) perl-Devel-Size(x86-64) ( =  0.84-3.el10)"

URI_perl-Devel-Size-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Devel-Size-tests-0.84-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Devel-Size-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(Config) ( ) perl(vars) ( ) perl(constant) ( ) perl(Scalar::Util) ( ) perl(feature) ( ) perl(Tie::Scalar) ( ) perl(Devel::Size) ( ) perl-Devel-Size ( =  0.84-3.el10)"
RPROVIDES:perl-Devel-Size-tests = "perl-Devel-Size-tests ( =  0.84-3.el10) perl-Devel-Size-tests(x86-64) ( =  0.84-3.el10)"
