
inherit dnf-bridge

PN = "perl-MailTools"
PE = "0"
PV = "2.21"
PR = "18.el10"
PACKAGES = "perl-MailTools"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-MailTools-2.21-18.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-MailTools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-MailTools-2.21-18.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-MailTools}"
RDEPENDS:perl-MailTools = " \
 perl-libnet \
 perl-TimeDate \
 perl-MailTools \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-POSIX \
 perl-Net-SMTP-SSL \
 perl-Exporter \
 perl-base \
"
