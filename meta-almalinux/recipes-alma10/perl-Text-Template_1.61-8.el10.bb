
PN = "perl-Text-Template"
PE = "0"
PV = "1.61"
PR = "8.el10"
PACKAGES = "perl-Text-Template perl-Text-Template-tests"


URI_perl-Text-Template = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Template-1.61-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Template = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(base) ( ) perl(Text::Template) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-Text-Template = "perl(Text::Template) ( =  1.61) perl(Text::Template::Preprocess) ( =  1.61) perl-Text-Template ( =  1.61-8.el10)"

URI_perl-Text-Template-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Template-tests-1.61-8.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Template-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Config) ( ) perl(vars) ( ) perl(File::Temp) ( ) perl(utf8) ( ) perl(Encode) ( ) perl(Text::Template) ( ) perl-Text-Template ( =  1.61-8.el10)"
RPROVIDES:perl-Text-Template-tests = "perl-Text-Template-tests ( =  1.61-8.el10)"
