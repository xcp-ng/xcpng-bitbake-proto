
PN = "perl-Socket6"
PE = "0"
PV = "0.29"
PR = "25.el10"
PACKAGES = "perl-Socket6 perl-Socket6-tests"


URI_perl-Socket6 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Socket6-0.29-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Socket6 = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(base) ( ) perl(DynaLoader) ( )"
RPROVIDES:perl-Socket6 = "perl(Socket6) ( =  0.29) perl-Socket6 ( =  0.29-25.el10) perl-Socket6(x86-64) ( =  0.29-25.el10)"

URI_perl-Socket6-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Socket6-tests-0.29-25.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Socket6-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test) ( ) perl(Socket) ( ) perl(Socket6) ( ) perl-Socket6 ( =  0.29-25.el10)"
RPROVIDES:perl-Socket6-tests = "perl-Socket6-tests ( =  0.29-25.el10) perl-Socket6-tests(x86-64) ( =  0.29-25.el10)"
