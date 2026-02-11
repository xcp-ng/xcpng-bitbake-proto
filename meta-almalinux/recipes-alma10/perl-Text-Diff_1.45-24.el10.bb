
PN = "perl-Text-Diff"
PE = "0"
PV = "1.45"
PR = "24.el10"
PACKAGES = "perl-Text-Diff perl-Text-Diff-tests"


URI_perl-Text-Diff = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Diff-1.45-24.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Diff = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(constant) ( ) perl(Text::Diff::Config) ( ) perl(:VERSION) ( >=  5.6.0) perl(Algorithm::Diff) ( >=  1.19)"
RPROVIDES:perl-Text-Diff = "perl(Text::Diff::Base) ( ) perl(Text::Diff) ( =  1.45) perl(Text::Diff::Config) ( =  1.44) perl(Text::Diff::Table) ( =  1.44) perl-Text-Diff ( =  1.45-24.el10)"

URI_perl-Text-Diff-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Diff-tests-1.45-24.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Diff-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(Data::Dumper) ( ) perl(Test) ( ) perl(Text::Diff) ( ) perl-Text-Diff ( =  1.45-24.el10)"
RPROVIDES:perl-Text-Diff-tests = "perl-Text-Diff-tests ( =  1.45-24.el10)"
