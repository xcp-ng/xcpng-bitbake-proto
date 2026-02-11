
PN = "beakerlib"
PE = "0"
PV = "1.29.2"
PR = "2.el10"
PACKAGES = "beakerlib beakerlib-vim-syntax"


URI_beakerlib = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/beakerlib-1.29.2-2.el10.noarch.rpm;unpack=0"
RDEPENDS:beakerlib = "/bin/sh ( ) coreutils ( ) iproute ( ) util-linux ( ) sed ( ) /bin/bash ( ) grep ( ) which ( ) tar ( ) /usr/bin/bc ( ) /usr/bin/time ( ) gzip ( ) nfs-utils ( ) yum-utils ( ) wget ( or  curl)"
RPROVIDES:beakerlib = "beakerlib ( =  1.29.2-2.el10) config(beakerlib) ( =  1.29.2-2.el10)"

URI_beakerlib-vim-syntax = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/beakerlib-vim-syntax-1.29.2-2.el10.noarch.rpm;unpack=0"
RDEPENDS:beakerlib-vim-syntax = "vim-common ( )"
RPROVIDES:beakerlib-vim-syntax = "beakerlib-vim-syntax ( =  1.29.2-2.el10)"
