
PN = "perl-Digest-SHA1"
PE = "0"
PV = "2.13"
PR = "44.el10"
PACKAGES = "perl-Digest-SHA1 perl-Digest-SHA1-tests"


URI_perl-Digest-SHA1 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-SHA1-2.13-44.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-SHA1 = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl(Exporter) ( ) perl(vars) ( ) perl-libs ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libperl.so.5.38()(64bit) ( ) perl(:MODULE_COMPAT_5.38.2) ( ) perl(DynaLoader) ( )"
RPROVIDES:perl-Digest-SHA1 = "perl-Digest-SHA1 ( =  2.13-44.el10) perl(Digest::SHA1) ( =  2.13) perl-Digest-SHA1(x86-64) ( =  2.13-44.el10)"

URI_perl-Digest-SHA1-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-SHA1-tests-2.13-44.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-SHA1-tests = "/usr/bin/perl ( ) perl-Test-Harness ( ) /usr/bin/bash ( ) perl(vars) ( ) perl(Test) ( ) perl(Digest::SHA1) ( ) perl-Digest-SHA1 ( =  2.13-44.el10)"
RPROVIDES:perl-Digest-SHA1-tests = "perl-Digest-SHA1-tests ( =  2.13-44.el10) perl-Digest-SHA1-tests(x86-64) ( =  2.13-44.el10)"
