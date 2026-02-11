
PN = "perl-XS-Parse-Keyword"
PE = "0"
PV = "0.39"
PR = "7.el10"
PACKAGES = "perl-XS-Parse-Keyword perl-XS-Parse-Keyword-Builder perl-XS-Parse-Keyword-tests"


URI_perl-XS-Parse-Keyword = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/perl-XS-Parse-Keyword-0.39-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-XS-Parse-Keyword = "rtld(GNU_HASH) ( ) perl-libs ( ) perl(warnings) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(XSLoader) ( ) perl(XS::Parse::Keyword) ( ) perl(:VERSION) ( >=  5.14.0)"
RPROVIDES:perl-XS-Parse-Keyword = "perl(:XS_Parse_Infix_ABI_1) ( ) perl(:XS_Parse_Infix_ABI_2) ( ) perl(:XS_Parse_Keyword_ABI_1) ( ) perl(:XS_Parse_Keyword_ABI_2) ( ) perl(XS::Parse::Infix) ( =  0.39) perl(XS::Parse::Keyword) ( =  0.39) perl-XS-Parse-Keyword ( =  0.39-7.el10) perl-XS-Parse-Keyword(x86-64) ( =  0.39-7.el10)"

URI_perl-XS-Parse-Keyword-Builder = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XS-Parse-Keyword-Builder-0.39-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-XS-Parse-Keyword-Builder = "perl(warnings) ( ) perl-libs ( ) perl(constant) ( ) perl-interpreter ( ) perl(XS::Parse::Infix::Builder_data) ( ) perl(XS::Parse::Keyword::Builder_data) ( ) perl(:VERSION) ( >=  5.14.0) perl-XS-Parse-Keyword(x86-64) ( =  0.39-7.el10)"
RPROVIDES:perl-XS-Parse-Keyword-Builder = "rpm_macro(perl_XS_Parse_Infix_ABI) ( ) rpm_macro(perl_XS_Parse_Keyword_ABI) ( ) perl(XS::Parse::Infix::Builder) ( =  0.39) perl(XS::Parse::Infix::Builder_data) ( =  0.39) perl(XS::Parse::Keyword::Builder) ( =  0.39) perl(XS::Parse::Keyword::Builder_data) ( =  0.39) perl-XS-Parse-Keyword-Builder ( =  0.39-7.el10) perl-XS-Parse-Keyword-Builder(x86-64) ( =  0.39-7.el10)"

URI_perl-XS-Parse-Keyword-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-XS-Parse-Keyword-tests-0.39-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-XS-Parse-Keyword-tests = "rtld(GNU_HASH) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(lib) ( ) perl(utf8) ( ) perl(overload) ( ) perl(constant) ( ) perl(XSLoader) ( ) perl(B) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( ) perl(B::Deparse) ( ) perl(Test2::V0) ( ) perl(XS::Parse::Keyword) ( ) perl(:VERSION) ( >=  5.14.0) perl-XS-Parse-Keyword(x86-64) ( =  0.39-7.el10) perl(:VERSION) ( >=  5.16.0)"
RPROVIDES:perl-XS-Parse-Keyword-tests = "perl-XS-Parse-Keyword-tests ( =  0.39-7.el10) perl-XS-Parse-Keyword-tests(x86-64) ( =  0.39-7.el10)"
