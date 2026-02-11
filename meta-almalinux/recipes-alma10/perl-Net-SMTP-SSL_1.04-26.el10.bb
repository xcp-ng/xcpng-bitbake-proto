
PN = "perl-Net-SMTP-SSL"
PE = "0"
PV = "1.04"
PR = "26.el10"
PACKAGES = "perl-Net-SMTP-SSL perl-Net-SMTP-SSL-tests"


URI_perl-Net-SMTP-SSL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-SMTP-SSL-1.04-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-SMTP-SSL = "perl(strict) ( ) perl-libs ( ) perl(IO::Socket::SSL) ( ) perl(Net::SMTP) ( )"
RPROVIDES:perl-Net-SMTP-SSL = "perl(Net::SMTP::SSL) ( =  1.04) perl-Net-SMTP-SSL ( =  1.04-26.el10)"

URI_perl-Net-SMTP-SSL-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-SMTP-SSL-tests-1.04-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-SMTP-SSL-tests = "/usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(Test::More) ( ) perl(Net::SMTP::SSL) ( ) perl-Net-SMTP-SSL ( =  1.04-26.el10)"
RPROVIDES:perl-Net-SMTP-SSL-tests = "perl-Net-SMTP-SSL-tests ( =  1.04-26.el10)"
