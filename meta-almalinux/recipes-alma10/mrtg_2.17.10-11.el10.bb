
PN = "mrtg"
PE = "0"
PV = "2.17.10"
PR = "11.el10"
PACKAGES = "mrtg mrtg-selinux"


URI_mrtg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mrtg-2.17.10-11.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mrtg = "
 perl-SNMP_Session
 systemd
 perl-libs
 mrtg
 mrtg-selinux
 perl-locale
 perl-Socket
 perl-FindBin
 perl-Socket6
 perl-Getopt-Long
 perl-CGI
 perl-Carp
 perl-vars
 perl-IO
 perl-IO-Socket-INET6
 gd
 perl-Math-BigInt
 bash
 perl-Exporter
 perl-POSIX
 glibc
 perl-interpreter
 perl-lib
 perl-Pod-Usage
"

URI_mrtg-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mrtg-selinux-2.17.10-11.el10.noarch.rpm;unpack=0"
RDEPENDS:mrtg-selinux = "
 policycoreutils-python-utils
 policycoreutils
 bash
 selinux-policy
 libselinux-utils
 selinux-policy-targeted
"
