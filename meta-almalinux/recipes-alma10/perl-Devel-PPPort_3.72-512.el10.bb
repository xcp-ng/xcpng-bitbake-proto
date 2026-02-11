
PN = "perl-Devel-PPPort"
PE = "0"
PV = "3.72"
PR = "512.el10"
PACKAGES = "perl-Devel-PPPort perl-Devel-PPPort-tests"


URI_perl-Devel-PPPort = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Devel-PPPort-3.72-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Devel-PPPort = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) perl(strict) ( ) perl-libs ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(:MODULE_COMPAT_5.40.0) ( )"
RPROVIDES:perl-Devel-PPPort = "perl(Devel::PPPort) ( =  3.72) perl-Devel-PPPort ( =  3.72-512.el10) perl-Devel-PPPort(x86-64) ( =  3.72-512.el10)"

URI_perl-Devel-PPPort-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Devel-PPPort-tests-3.72-512.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Devel-PPPort-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(File::Spec) ( ) perl(lib) ( ) perl(Config) ( ) perl(vars) ( ) perl(utf8) ( ) perl(overload) ( ) perl(File::Path) ( ) perl(FindBin) ( ) perl(DynaLoader) ( ) perl(Tie::Hash) ( ) perl(less) ( ) perl-Devel-PPPort ( =  3.72-512.el10)"
RPROVIDES:perl-Devel-PPPort-tests = "perl-Devel-PPPort-tests ( =  3.72-512.el10) perl-Devel-PPPort-tests(x86-64) ( =  3.72-512.el10)"
