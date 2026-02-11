
PN = "perl-PerlIO-utf8_strict"
PE = "0"
PV = "0.010"
PR = "10.el10"
PACKAGES = "perl-PerlIO-utf8_strict perl-PerlIO-utf8_strict-tests"


URI_perl-PerlIO-utf8_strict = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-PerlIO-utf8_strict-0.010-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PerlIO-utf8_strict = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(XSLoader) ( )"
RPROVIDES:perl-PerlIO-utf8_strict = "perl(PerlIO::utf8_strict) ( =  0.010) perl-PerlIO-utf8_strict ( =  0.010-10.el10) perl-PerlIO-utf8_strict(x86-64) ( =  0.010-10.el10)"

URI_perl-PerlIO-utf8_strict-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-PerlIO-utf8_strict-tests-0.010-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-PerlIO-utf8_strict-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(lib) ( ) perl(Carp) ( ) perl(utf8) ( ) perl(IO::Handle) ( ) perl(File::Spec::Functions) ( ) perl(IO::File) ( ) perl(Test::Exception) ( ) perl(Test::More) ( >=  0.88) perl-PerlIO-utf8_strict ( =  0.010-10.el10)"
RPROVIDES:perl-PerlIO-utf8_strict-tests = "perl-PerlIO-utf8_strict-tests ( =  0.010-10.el10) perl-PerlIO-utf8_strict-tests(x86-64) ( =  0.010-10.el10)"
