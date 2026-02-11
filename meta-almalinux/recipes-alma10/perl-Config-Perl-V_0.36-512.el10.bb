
PN = "perl-Config-Perl-V"
PE = "0"
PV = "0.36"
PR = "512.el10"
PACKAGES = "perl-Config-Perl-V perl-Config-Perl-V-tests"


URI_perl-Config-Perl-V = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Config-Perl-V-0.36-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Config-Perl-V = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Exporter) ( ) perl(vars) ( ) perl(Config) ( )"
RPROVIDES:perl-Config-Perl-V = "perl(Config::Perl::V) ( =  0.36) perl-Config-Perl-V ( =  0.36-512.el10)"

URI_perl-Config-Perl-V-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Config-Perl-V-tests-0.36-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Config-Perl-V-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Digest::MD5) ( ) perl(Test::NoWarnings) ( ) perl(Config::Perl::V) ( ) perl-Config-Perl-V ( =  0.36-512.el10)"
RPROVIDES:perl-Config-Perl-V-tests = "perl-Config-Perl-V-tests ( =  0.36-512.el10)"
