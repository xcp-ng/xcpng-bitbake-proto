
PN = "vim"
PE = "2"
PV = "9.1.083"
PR = "5.el10_0.1"
PACKAGES = "vim-data vim-filesystem vim-minimal vim-X11 vim-common vim-enhanced xxd"


URI_vim-data = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/vim-data-9.1.083-5.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:vim-data = ""

URI_vim-filesystem = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/vim-filesystem-9.1.083-5.el10_0.1.noarch.rpm;unpack=0"
RDEPENDS:vim-filesystem = ""

URI_vim-minimal = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/vim-minimal-9.1.083-5.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:vim-minimal = " \
 libacl \
 vim-data \
 bash \
 ncurses-libs \
 glibc \
 libselinux \
"

URI_vim-X11 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vim-X11-9.1.083-5.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:vim-X11 = " \
 libacl \
 vim-common \
 libattr \
 libICE \
 pango \
 gdk-pixbuf2 \
 libX11 \
 libSM \
 libcanberra \
 libXt \
 bash \
 cairo \
 glib2 \
 gtk3 \
 glibc \
 libselinux \
 ncurses-libs \
 hicolor-icon-theme \
"

URI_vim-common = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vim-common-9.1.083-5.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:vim-common = " \
 vim-filesystem \
 bash \
 vim-data \
 xxd \
"

URI_vim-enhanced = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vim-enhanced-9.1.083-5.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:vim-enhanced = " \
 libacl \
 vim-common \
 bash \
 ncurses-libs \
 which \
 glibc \
 libselinux \
"

URI_xxd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xxd-9.1.083-5.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:xxd = " \
 glibc \
"
