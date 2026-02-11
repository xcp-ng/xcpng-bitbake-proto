
PN = "perl-File-Listing"
PE = "0"
PV = "6.16"
PR = "5.el10"
PACKAGES = "perl-File-Listing perl-File-Listing-tests"


URI_perl-File-Listing = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-File-Listing-6.16-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Listing = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(HTTP::Date) ( ) perl(Exporter) ( >=  5.57)"
RPROVIDES:perl-File-Listing = "perl(File::Listing) ( =  6.16) perl-File-Listing ( =  6.16-5.el10)"

URI_perl-File-Listing-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-File-Listing-tests-6.16-5.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-File-Listing-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(File::Listing) ( ) perl-File-Listing ( =  6.16-5.el10)"
RPROVIDES:perl-File-Listing-tests = "perl-File-Listing-tests ( =  6.16-5.el10)"
