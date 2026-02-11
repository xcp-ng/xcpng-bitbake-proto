
PN = "perl-Data-UUID"
PE = "0"
PV = "1.227"
PR = "3.el10"
PACKAGES = "perl-Data-UUID perl-Data-UUID-tests"


URI_perl-Data-UUID = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Data-UUID-1.227-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Data-UUID = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) perl(Carp) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(DynaLoader) ( ) perl(Digest::MD5) ( )"
RPROVIDES:perl-Data-UUID = "perl(Data::UUID) ( =  1.227) perl-Data-UUID ( =  1.227-3.el10) perl-Data-UUID(x86-64) ( =  1.227-3.el10)"

URI_perl-Data-UUID-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Data-UUID-tests-1.227-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Data-UUID-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(threads) ( ) perl(Data::UUID) ( ) perl-Data-UUID ( =  1.227-3.el10)"
RPROVIDES:perl-Data-UUID-tests = "perl-Data-UUID-tests ( =  1.227-3.el10) perl-Data-UUID-tests(x86-64) ( =  1.227-3.el10)"
