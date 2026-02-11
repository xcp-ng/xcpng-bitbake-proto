
PN = "flatpak-xdg-utils"
PE = "0"
PV = "1.0.6"
PR = "1.el10"
PACKAGES = "flatpak-spawn flatpak-xdg-utils flatpak-xdg-utils-tests"


URI_flatpak-spawn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flatpak-spawn-1.0.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-spawn = " \
 glibc \
 libgcc \
 glib2 \
"

URI_flatpak-xdg-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flatpak-xdg-utils-1.0.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-xdg-utils = " \
 glibc \
 libgcc \
 flatpak-spawn \
 glib2 \
"

URI_flatpak-xdg-utils-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flatpak-xdg-utils-tests-1.0.6-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-xdg-utils-tests = " \
 flatpak-spawn \
 flatpak-xdg-utils \
 libgcc \
 glib2 \
 glibc \
"
