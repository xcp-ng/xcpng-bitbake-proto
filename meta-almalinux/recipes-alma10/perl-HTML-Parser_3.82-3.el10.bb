
PN = "perl-HTML-Parser"
PE = "0"
PV = "3.82"
PR = "3.el10"
PACKAGES = "perl-HTML-Parser perl-HTML-Parser-tests"


URI_perl-HTML-Parser = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTML-Parser-3.82-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-HTML-Parser = "rtld(GNU_HASH) ( ) perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) libperl.so.5.40()(64bit) ( ) perl(XSLoader) ( ) perl(:MODULE_COMPAT_5.40.0) ( ) perl(IO::File) ( ) perl(URI) ( ) perl(HTML::Entities) ( ) perl(HTTP::Headers) ( ) perl(HTML::Parser) ( ) perl(HTML::PullParser) ( ) perl(:VERSION) ( >=  5.4.0) perl(HTML::Tagset) ( >=  3)"
RPROVIDES:perl-HTML-Parser = "perl(HTML::Entities) ( =  3.82) perl(HTML::Filter) ( =  3.82) perl(HTML::HeadParser) ( =  3.82) perl(HTML::LinkExtor) ( =  3.82) perl(HTML::Parser) ( =  3.82) perl(HTML::PullParser) ( =  3.82) perl(HTML::TokeParser) ( =  3.82) perl-HTML-Parser ( =  3.82-3.el10) perl-HTML-Parser(x86-64) ( =  3.82-3.el10)"

URI_perl-HTML-Parser-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTML-Parser-tests-3.82-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-HTML-Parser-tests = "perl(strict) ( ) /usr/bin/perl ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) /usr/bin/bash ( ) perl(File::Spec) ( ) perl(Config) ( ) perl(utf8) ( ) perl(ExtUtils::MakeMaker) ( ) perl(IO::File) ( ) perl(threads) ( ) perl(URI) ( ) perl(SelectSaver) ( ) perl(HTML::Entities) ( ) perl(HTML::Filter) ( ) perl(HTML::HeadParser) ( ) perl(HTML::LinkExtor) ( ) perl(HTML::Parser) ( ) perl(HTML::PullParser) ( ) perl(HTML::TokeParser) ( ) perl-HTML-Parser ( =  3.82-3.el10)"
RPROVIDES:perl-HTML-Parser-tests = "perl-HTML-Parser-tests ( =  3.82-3.el10) perl-HTML-Parser-tests(x86-64) ( =  3.82-3.el10)"
