
inherit dnf-bridge

PN = "perl-Net-SMTP-SSL"
PE = "0"
PV = "1.04"
PR = "26.el10"
PACKAGES = "perl-Net-SMTP-SSL perl-Net-SMTP-SSL-tests"


URI_perl-Net-SMTP-SSL = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Net-SMTP-SSL-1.04-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-SMTP-SSL = " \
 perl-libnet \
 perl-libs \
 perl-IO-Socket-SSL \
"

URI_perl-Net-SMTP-SSL-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Net-SMTP-SSL-tests-1.04-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Net-SMTP-SSL-tests = " \
 perl-Test-Harness \
 perl-Test-Simple \
 bash \
 perl-interpreter \
 perl-Net-SMTP-SSL \
"
