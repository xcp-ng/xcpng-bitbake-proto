
inherit dnf-bridge

PN = "pinentry"
PE = "0"
PV = "1.3.1"
PR = "1.el10"
PACKAGES = "pinentry pinentry-gnome3 pinentry-tty pinentry-emacs pinentry-qt"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/pinentry-1.3.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_pinentry = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pinentry-1.3.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pinentry}"
RDEPENDS:pinentry = " \
 libassuan \
 libgpg-error \
 libsecret \
 ncurses-libs \
 bash \
 glib2 \
 glibc \
"

URI_pinentry-gnome3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pinentry-gnome3-1.3.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pinentry-gnome3}"
RDEPENDS:pinentry-gnome3 = " \
 libassuan \
 libgpg-error \
 pinentry \
 libsecret \
 ncurses-libs \
 glib2 \
 glibc \
 gcr-libs \
"

URI_pinentry-tty = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pinentry-tty-1.3.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pinentry-tty}"
RDEPENDS:pinentry-tty = " \
 libassuan \
 libgpg-error \
 pinentry \
 libsecret \
 glib2 \
 glibc \
"

URI_pinentry-emacs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pinentry-emacs-1.3.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pinentry-emacs}"
RDEPENDS:pinentry-emacs = " \
 libassuan \
 libgpg-error \
 pinentry \
 libsecret \
 glib2 \
 glibc \
"

URI_pinentry-qt = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pinentry-qt-1.3.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_pinentry-qt}"
RDEPENDS:pinentry-qt = " \
 libassuan \
 libgcc \
 qt6-qtbase \
 libgpg-error \
 pinentry \
 libsecret \
 libstdc++ \
 qt6-qtbase-gui \
 glib2 \
 ncurses-libs \
 glibc \
"
