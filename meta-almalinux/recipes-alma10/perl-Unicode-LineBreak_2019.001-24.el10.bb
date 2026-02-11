
PN = "perl-Unicode-LineBreak"
PE = "0"
PV = "2019.001"
PR = "24.el10"
PACKAGES = "perl-Unicode-LineBreak perl-Unicode-LineBreak-tests"


URI_perl-Unicode-LineBreak = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Unicode-LineBreak-2019.001-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-LineBreak = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(vars) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(overload) ( ) perl(Unicode::GCString) ( ) libsombok.so.3()(64bit) ( ) perl(Unicode::LineBreak) ( ) perl(:VERSION) ( >=  5.8.0) perl(Encode) ( >=  1.98) perl(MIME::Charset) ( >=  1.006.2) perl(constant) ( >=  1.01)"
RPROVIDES:perl-Unicode-LineBreak = "perl(Text::LineFold) ( =  2018.012) perl(Unicode::GCString) ( =  2013.10) perl(Unicode::LineBreak) ( =  2019.001) perl-Unicode-LineBreak ( =  2019.001-24.el10) perl-Unicode-LineBreak(x86-64) ( =  2019.001-24.el10)"

URI_perl-Unicode-LineBreak-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Unicode-LineBreak-tests-2019.001-24.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-Unicode-LineBreak-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(lib) ( ) perl(FindBin) ( ) perl(Unicode::GCString) ( ) perl(Unicode::LineBreak) ( ) perl-Unicode-LineBreak ( =  2019.001-24.el10)"
RPROVIDES:perl-Unicode-LineBreak-tests = "perl-Unicode-LineBreak-tests ( =  2019.001-24.el10) perl-Unicode-LineBreak-tests(x86-64) ( =  2019.001-24.el10)"
