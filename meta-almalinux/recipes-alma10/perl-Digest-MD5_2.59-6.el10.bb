
PN = "perl-Digest-MD5"
PE = "0"
PV = "2.59"
PR = "6.el10"
PACKAGES = "perl-Digest-MD5 perl-Digest-MD5-tests"


URI_perl-Digest-MD5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Digest-MD5-2.59-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-MD5 = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(Digest::base) ( >=  1.00)"
RPROVIDES:perl-Digest-MD5 = "perl(Digest::MD5) ( =  2.59) perl-Digest-MD5 ( =  2.59-6.el10) perl-Digest-MD5(x86-64) ( =  2.59-6.el10)"

URI_perl-Digest-MD5-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Digest-MD5-tests-2.59-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Digest-MD5-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(vars) ( ) perl(Encode) ( ) perl(threads) ( ) perl(Digest::MD5) ( ) perl-Digest-MD5 ( =  2.59-6.el10)"
RPROVIDES:perl-Digest-MD5-tests = "perl-Digest-MD5-tests ( =  2.59-6.el10) perl-Digest-MD5-tests(x86-64) ( =  2.59-6.el10)"
