
PN = "perl-Module-CPANfile"
PE = "0"
PV = "1.1004"
PR = "22.el10"
PACKAGES = "perl-Module-CPANfile perl-Module-CPANfile-tests"


URI_perl-Module-CPANfile = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Module-CPANfile-1.1004-22.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-CPANfile = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) /usr/bin/perl ( ) perl(Getopt::Long) ( ) perl(Cwd) ( ) perl(Data::Dumper) ( ) perl(Pod::Usage) ( ) perl(CPAN::Meta::Requirements) ( ) perl(CPAN::Meta::Feature) ( ) perl(Module::CPANfile) ( ) perl(CPAN::Meta) ( >=  2.12091) perl(CPAN::Meta::Feature) ( >=  2.12091) perl(CPAN::Meta::Prereqs) ( >=  2.12091)"
RPROVIDES:perl-Module-CPANfile = "perl(Module::CPANfile::Environment) ( ) perl(Module::CPANfile::Prereq) ( ) perl(Module::CPANfile::Prereqs) ( ) perl(Module::CPANfile::Requirement) ( ) perl(Module::CPANfile) ( =  1.1004) perl-Module-CPANfile ( =  1.1004-22.el10)"

URI_perl-Module-CPANfile-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Module-CPANfile-tests-1.1004-22.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Module-CPANfile-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(lib) ( ) perl(Exporter) ( ) perl(base) ( ) perl(POSIX) ( ) perl(File::pushd) ( ) perl(Module::CPANfile) ( ) perl-Module-CPANfile ( =  1.1004-22.el10)"
RPROVIDES:perl-Module-CPANfile-tests = "perl-Module-CPANfile-tests ( =  1.1004-22.el10)"
