
PN = "enchant2"
PE = "0"
PV = "2.6.7"
PR = "3.el10"
PACKAGES = "enchant2 enchant2-voikko enchant2-devel"


URI_enchant2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/enchant2-2.6.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:enchant2 = "
 libgcc
 hunspell
 libstdc++
 glib2
 glibc
"

URI_enchant2-voikko = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/enchant2-voikko-2.6.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:enchant2-voikko = "
 glibc
 glib2
 enchant2
 libvoikko
"

URI_enchant2-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/enchant2-devel-2.6.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:enchant2-devel = "
 glib2-devel
 pkgconf-pkg-config
 enchant2
"
