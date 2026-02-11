
PN = "perl-B-COW"
PE = "0"
PV = "0.007"
PR = "9.el10"
PACKAGES = "perl-B-COW perl-B-COW-tests"


URI_perl-B-COW = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-B-COW-0.007-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-B-COW = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl(warnings) ( ) perl(Exporter) ( ) perl-libs ( ) perl(base) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) libperl.so.5.40()(64bit) ( )"
RPROVIDES:perl-B-COW = "perl-B-COW ( =  0.007-9.el10) perl(B::COW) ( =  0.007) perl-B-COW(x86-64) ( =  0.007-9.el10)"

URI_perl-B-COW-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-B-COW-tests-0.007-9.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-B-COW-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(ExtUtils::MakeMaker) ( ) perl(B::COW) ( ) perl(Devel::Peek) ( ) perl(Test::More) ( >=  0.88) perl-B-COW ( =  0.007-9.el10)"
RPROVIDES:perl-B-COW-tests = "perl-B-COW-tests ( =  0.007-9.el10)"
