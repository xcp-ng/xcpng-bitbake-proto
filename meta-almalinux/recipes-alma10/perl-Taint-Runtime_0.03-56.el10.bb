
PN = "perl-Taint-Runtime"
PE = "0"
PV = "0.03"
PR = "56.el10"
PACKAGES = "perl-Taint-Runtime perl-Taint-Runtime-tests"


URI_perl-Taint-Runtime = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-Taint-Runtime-0.03-56.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Taint-Runtime = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Exporter) ( ) perl(Carp) ( ) /usr/bin/perl ( ) perl(vars) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(XSLoader) ( ) perl(Taint::Runtime) ( ) perl(Benchmark) ( )"
RPROVIDES:perl-Taint-Runtime = "perl(Taint::Runtime) ( =  0.03) perl-Taint-Runtime ( =  0.03-56.el10) perl-Taint-Runtime(x86-64) ( =  0.03-56.el10)"

URI_perl-Taint-Runtime-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Taint-Runtime-tests-0.03-56.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Taint-Runtime-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl-Taint-Runtime ( =  0.03-56.el10)"
RPROVIDES:perl-Taint-Runtime-tests = "perl-Taint-Runtime-tests ( =  0.03-56.el10) perl-Taint-Runtime-tests(x86-64) ( =  0.03-56.el10)"
