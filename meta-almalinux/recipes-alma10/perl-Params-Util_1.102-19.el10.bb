
PN = "perl-Params-Util"
PE = "0"
PV = "1.102"
PR = "19.el10"
PACKAGES = "perl-Params-Util perl-Params-Util-tests"


URI_perl-Params-Util = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Params-Util-1.102-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Params-Util = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(overload) ( ) perl(parent) ( ) perl(Params::Util::PP) ( ) perl(:VERSION) ( >=  5.5.30) perl(Scalar::Util) ( >=  1.18) perl(XSLoader) ( >=  0.22)"
RPROVIDES:perl-Params-Util = "perl(Params::Util) ( =  1.102) perl(Params::Util::PP) ( =  1.102) perl-Params-Util ( =  1.102-19.el10) perl-Params-Util(x86-64) ( =  1.102-19.el10)"

URI_perl-Params-Util-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Params-Util-tests-1.102-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Params-Util-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(vars) ( ) perl(overload) ( ) perl(File::Spec::Functions) ( ) perl(Params::Util) ( ) perl(:VERSION) ( >=  5.5.30) perl-Params-Util ( =  1.102-19.el10)"
RPROVIDES:perl-Params-Util-tests = "perl-Params-Util-tests ( =  1.102-19.el10) perl-Params-Util-tests(x86-64) ( =  1.102-19.el10)"
