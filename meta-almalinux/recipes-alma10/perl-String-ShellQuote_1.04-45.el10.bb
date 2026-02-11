
PN = "perl-String-ShellQuote"
PE = "0"
PV = "1.04"
PR = "45.el10"
PACKAGES = "perl-String-ShellQuote perl-String-ShellQuote-tests"


URI_perl-String-ShellQuote = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-String-ShellQuote-1.04-45.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-String-ShellQuote = "perl(strict) ( ) perl-libs ( ) perl(Carp) ( ) perl(Exporter) ( ) /usr/bin/perl ( ) perl(vars) ( ) perl(Getopt::Long) ( ) perl(String::ShellQuote) ( )"
RPROVIDES:perl-String-ShellQuote = "perl(String::ShellQuote) ( =  1.04) perl-String-ShellQuote ( =  1.04-45.el10)"

URI_perl-String-ShellQuote-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-String-ShellQuote-tests-1.04-45.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-String-ShellQuote-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(String::ShellQuote) ( ) perl-String-ShellQuote ( =  1.04-45.el10)"
RPROVIDES:perl-String-ShellQuote-tests = "perl-String-ShellQuote-tests ( =  1.04-45.el10)"
