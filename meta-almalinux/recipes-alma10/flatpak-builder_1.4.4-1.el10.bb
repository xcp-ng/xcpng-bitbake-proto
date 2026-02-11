
PN = "flatpak-builder"
PE = "0"
PV = "1.4.4"
PR = "1.el10"
PACKAGES = "flatpak-builder flatpak-builder-tests"


URI_flatpak-builder = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flatpak-builder-1.4.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-builder = "
 ostree-libs
 appstream-compose
 libgcc
 libxml2
 elfutils-libelf
 json-glib
 libyaml
 glib2
 libcurl
 glibc
 debugedit
 ostree
 flatpak
"

URI_flatpak-builder-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/flatpak-builder-tests-1.4.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flatpak-builder-tests = "
 bash
 flatpak-builder
"
