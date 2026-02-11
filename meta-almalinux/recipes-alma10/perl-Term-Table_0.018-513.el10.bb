
PN = "perl-Term-Table"
PE = "0"
PV = "0.018"
PR = "513.el10"
PACKAGES = "perl-Term-Table perl-Term-Table-tests"


URI_perl-Term-Table = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-Table-0.018-513.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-Table = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Exporter) ( ) perl(Config) ( ) perl(Scalar::Util) ( ) perl(base) ( ) perl(List::Util) ( ) perl(Term::Table::Cell) ( ) perl(Term::Table::LineBreak) ( ) perl(Term::Table::Util) ( ) perl(Term::Table::HashBase) ( )"
RPROVIDES:perl-Term-Table = "perl(Term::Table) ( =  0.018) perl(Term::Table::Cell) ( =  0.018) perl(Term::Table::CellStack) ( =  0.018) perl(Term::Table::HashBase) ( =  0.018) perl(Term::Table::LineBreak) ( =  0.018) perl(Term::Table::Spacer) ( =  0.018) perl(Term::Table::Util) ( =  0.018) perl-Term-Table ( =  0.018-513.el10)"

URI_perl-Term-Table-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Term-Table-tests-0.018-513.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-Table-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(base) ( ) perl(utf8) ( ) perl(Test2::Tools::Tiny) ( ) perl(Test2::API) ( ) perl(Term::Table) ( ) perl(Term::Table::Cell) ( ) perl(Term::Table::CellStack) ( ) perl(Term::Table::HashBase) ( ) perl(Term::Table::LineBreak) ( ) perl(Term::Table::Util) ( ) perl-Term-Table ( =  0.018-513.el10)"
RPROVIDES:perl-Term-Table-tests = "perl-Term-Table-tests ( =  0.018-513.el10)"
