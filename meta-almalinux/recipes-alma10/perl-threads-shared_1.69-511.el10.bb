
PN = "perl-threads-shared"
PE = "0"
PV = "1.69"
PR = "511.el10"
PACKAGES = "perl-threads-shared perl-threads-shared-tests"


URI_perl-threads-shared = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-threads-shared-1.69-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-threads-shared = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(Config) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(Scalar::Util) ( ) perl(:VERSION) ( >=  5.8.0) perl(threads) ( >=  1.73)"
RPROVIDES:perl-threads-shared = "perl(threads::shared) ( =  1.69) perl-threads-shared ( =  1.69-511.el10) perl-threads-shared(x86-64) ( =  1.69-511.el10)"

URI_perl-threads-shared-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-threads-shared-tests-1.69-511.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-threads-shared-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(Scalar::Util) ( ) perl(POSIX) ( ) perl(threads) ( ) perl(Time::HiRes) ( ) perl(threads::shared) ( ) perl(ExtUtils::testlib) ( ) perl-threads-shared ( =  1.69-511.el10)"
RPROVIDES:perl-threads-shared-tests = "perl-threads-shared-tests ( =  1.69-511.el10) perl-threads-shared-tests(x86-64) ( =  1.69-511.el10)"
