
PN = "perl-Term-ANSIColor"
PE = "0"
PV = "5.01"
PR = "512.el10"
PACKAGES = "perl-Term-ANSIColor perl-Term-ANSIColor-tests"


URI_perl-Term-ANSIColor = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-ANSIColor-5.01-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-ANSIColor = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(:VERSION) ( >=  5.8.0)"
RPROVIDES:perl-Term-ANSIColor = "perl(Term::ANSIColor) ( =  5.01) perl-Term-ANSIColor ( =  5.01-512.el10)"

URI_perl-Term-ANSIColor-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Term-ANSIColor-tests-5.01-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-ANSIColor-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(Carp) ( ) perl(File::Temp) ( ) perl(base) ( ) perl(overload) ( ) perl(:VERSION) ( >=  5.8.0) perl-Term-ANSIColor ( =  5.01-512.el10)"
RPROVIDES:perl-Term-ANSIColor-tests = "perl-Term-ANSIColor-tests ( =  5.01-512.el10)"
