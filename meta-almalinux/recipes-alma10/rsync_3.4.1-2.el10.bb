
PN = "rsync"
PE = "0"
PV = "3.4.1"
PR = "2.el10"
PACKAGES = "rsync rsync-daemon rsync-rrsync"


URI_rsync = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rsync-3.4.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rsync = "
 libacl
 lz4-libs
 openssl-libs
 libzstd
 bash
 popt
 glibc
"

URI_rsync-daemon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsync-daemon-3.4.1-2.el10.noarch.rpm;unpack=0"
RDEPENDS:rsync-daemon = "
 rsync
 systemd
 bash
"

URI_rsync-rrsync = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/rsync-rrsync-3.4.1-2.el10.noarch.rpm;unpack=0"
RDEPENDS:rsync-rrsync = "
 python3
 rsync
"
