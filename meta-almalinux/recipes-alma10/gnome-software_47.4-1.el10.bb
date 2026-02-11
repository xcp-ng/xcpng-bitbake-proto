
PN = "gnome-software"
PE = "0"
PV = "47.4"
PR = "1.el10"
PACKAGES = "gnome-software gnome-software-fedora-langpacks gnome-software-devel"


URI_gnome-software = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-software-47.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-software = "
 ostree-libs
 flatpak-libs
 appstream
 appstream-data
 pango
 PackageKit-glib
 json-glib
 gnome-menus
 libadwaita
 librsvg2
 libgcc
 libxmlb
 gdk-pixbuf2
 libgudev
 flatpak
 libsoup3
 gsettings-desktop-schemas
 fwupd
 polkit-libs
 glib2
 glibc
 gtk4
 iso-codes
"

URI_gnome-software-fedora-langpacks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-software-fedora-langpacks-47.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-software-fedora-langpacks = "
 glibc
 libgcc
 gnome-software
 glib2
"

URI_gnome-software-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-software-devel-47.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-software-devel = "
 json-glib-devel
 sysprof-capture-devel
 glib2-devel
 libsoup3-devel
 polkit-devel
 pkgconf-pkg-config
 libxmlb-devel
 appstream-devel
 gnome-software
 gtk4-devel
"
