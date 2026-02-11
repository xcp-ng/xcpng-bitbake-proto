
PN = "perl-TermReadKey"
PE = "0"
PV = "2.38"
PR = "24.el10"
PACKAGES = "perl-TermReadKey perl-TermReadKey-tests"


URI_perl-TermReadKey = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-TermReadKey-2.38-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-TermReadKey = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(DynaLoader) ( ) libc.so.6(GLIBC_2.28)(64bit) ( )"
RPROVIDES:perl-TermReadKey = "perl(Term::ReadKey) ( =  2.38) perl-TermReadKey ( =  2.38-24.el10) perl-TermReadKey(x86-64) ( =  2.38-24.el10)"

URI_perl-TermReadKey-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-TermReadKey-tests-2.38-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-TermReadKey-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Fcntl) ( ) perl(Term::ReadKey) ( ) perl-TermReadKey ( =  2.38-24.el10)"
RPROVIDES:perl-TermReadKey-tests = "perl-TermReadKey-tests ( =  2.38-24.el10) perl-TermReadKey-tests(x86-64) ( =  2.38-24.el10)"
