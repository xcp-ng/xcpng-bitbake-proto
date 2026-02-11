
PN = "perl-XString"
PE = "0"
PV = "0.005"
PR = "16.el10"
PACKAGES = "perl-XString perl-XString-tests"


URI_perl-XString = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-XString-0.005-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-XString = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(XSLoader) ( )"
RPROVIDES:perl-XString = "perl(XString) ( =  0.005) perl-XString ( =  0.005-16.el10) perl-XString(x86-64) ( =  0.005-16.el10)"

URI_perl-XString-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XString-tests-0.005-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-XString-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(B) ( ) perl(XString) ( ) perl-XString ( =  0.005-16.el10)"
RPROVIDES:perl-XString-tests = "perl-XString-tests ( =  0.005-16.el10) perl-XString-tests(x86-64) ( =  0.005-16.el10)"
