
inherit dnf-bridge

PN = "perl-SNMP_Session"
PE = "0"
PV = "1.16"
PR = "6.el10"
PACKAGES = "perl-SNMP_Session"


URI_perl-SNMP_Session = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-SNMP_Session-1.16-6.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-SNMP_Session = " \
 perl-SNMP_Session \
 perl-libs \
 perl-Carp \
 perl-vars \
 perl-IO \
 perl-Socket \
 perl-Socket6 \
 perl-IO-Socket-INET6 \
 perl-Exporter \
 perl-Net-SNMP \
"
