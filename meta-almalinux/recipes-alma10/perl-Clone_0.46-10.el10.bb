
PN = "perl-Clone"
PE = "0"
PV = "0.46"
PR = "10.el10"
PACKAGES = "perl-Clone perl-Clone-tests"


URI_perl-Clone = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Clone-0.46-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Clone = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(AutoLoader) ( )"
RPROVIDES:perl-Clone = "perl(Clone) ( =  0.46) perl-Clone ( =  0.46-10.el10) perl-Clone(x86-64) ( =  0.46-10.el10)"

URI_perl-Clone-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Clone-tests-0.46-10.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Clone-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(vars) ( ) perl(utf8) ( ) perl(B) ( ) perl(B::COW) ( ) perl(Clone) ( ) perl-Clone ( =  0.46-10.el10)"
RPROVIDES:perl-Clone-tests = "perl-Clone-tests ( =  0.46-10.el10)"
