
PN = "hunspell"
PE = "0"
PV = "1.7.2"
PR = "9.el10"
PACKAGES = "hunspell hunspell-devel hunspell-filesystem"


URI_hunspell = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-1.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hunspell = "
 hunspell-filesystem
 hunspell-en-US
 libgcc
 libstdc++
 ncurses-libs
 glibc
"

URI_hunspell-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-devel-1.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hunspell-devel = "
 perl-locale
 libgcc
 pkgconf-pkg-config
 perl-Getopt-Long
 hunspell
 libstdc++
 bash
 glibc
 perl-interpreter
"

URI_hunspell-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/hunspell-filesystem-1.7.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:hunspell-filesystem = ""
