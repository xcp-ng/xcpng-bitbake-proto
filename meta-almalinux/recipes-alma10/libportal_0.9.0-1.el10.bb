
PN = "libportal"
PE = "0"
PV = "0.9.0"
PR = "1.el10"
PACKAGES = "libportal libportal-gtk3 libportal-gtk4 libportal-qt6 libportal-devel libportal-devel-doc libportal-gtk3-devel libportal-gtk4-devel libportal-qt6-devel"


URI_libportal = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libportal-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal = "
 glibc
 libgcc
 glib2
"

URI_libportal-gtk3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libportal-gtk3-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-gtk3 = "
 libgcc
 glib2
 libportal
 gtk3
 glibc
"

URI_libportal-gtk4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libportal-gtk4-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-gtk4 = "
 libgcc
 glib2
 libportal
 glibc
 gtk4
"

URI_libportal-qt6 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libportal-qt6-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-qt6 = "
 libgcc
 qt6-qtbase
 libstdc++
 qt6-qtbase-gui
 glib2
 libportal
 glibc
"

URI_libportal-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libportal-devel-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-devel = "
 libportal
 glib2-devel
 pkgconf-pkg-config
"

URI_libportal-devel-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libportal-devel-doc-0.9.0-1.el10.noarch.rpm;unpack=0"
RDEPENDS:libportal-devel-doc = ""

URI_libportal-gtk3-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libportal-gtk3-devel-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-gtk3-devel = "
 glib2-devel
 libportal-devel
 pkgconf-pkg-config
 gtk3-devel
 libportal-gtk3
"

URI_libportal-gtk4-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libportal-gtk4-devel-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-gtk4-devel = "
 glib2-devel
 libportal-devel
 pkgconf-pkg-config
 libportal-gtk4
 gtk4-devel
"

URI_libportal-qt6-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libportal-qt6-devel-0.9.0-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libportal-qt6-devel = "
 glib2-devel
 libportal-devel
 pkgconf-pkg-config
 qt6-qtbase-devel
 libportal-qt6
"
