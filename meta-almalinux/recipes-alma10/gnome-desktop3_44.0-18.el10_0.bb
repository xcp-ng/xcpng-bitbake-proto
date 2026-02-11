
PN = "gnome-desktop3"
PE = "0"
PV = "44.0"
PR = "18.el10_0"
PACKAGES = "gnome-desktop3 gnome-desktop4 gnome-desktop3-devel gnome-desktop4-devel gnome-desktop3-tests"


URI_gnome-desktop3 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-desktop3-44.0-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-desktop3 = "
 bubblewrap
 systemd-libs
 shared-mime-info
 libseccomp
 gsettings-desktop-schemas
 libgcc
 gdk-pixbuf2
 cairo
 glib2
 gtk3
 glibc
 libxkbcommon
"

URI_gnome-desktop4 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-desktop4-44.0-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-desktop4 = "
 systemd-libs
 gnome-desktop3
 libgcc
 gdk-pixbuf2
 cairo
 glib2
 libseccomp
 glibc
 libxkbcommon
 gtk4
"

URI_gnome-desktop3-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-desktop3-devel-44.0-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-desktop3-devel = "
 glib2-devel
 gsettings-desktop-schemas-devel
 systemd-devel
 gnome-desktop3
 pkgconf-pkg-config
 libseccomp-devel
 gdk-pixbuf2-devel
 xkeyboard-config-devel
 gtk3-devel
 libxkbcommon-devel
 iso-codes-devel
"

URI_gnome-desktop4-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gnome-desktop4-devel-44.0-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-desktop4-devel = "
 glib2-devel
 gsettings-desktop-schemas-devel
 systemd-devel
 gnome-desktop4
 pkgconf-pkg-config
 libseccomp-devel
 gdk-pixbuf2-devel
 xkeyboard-config-devel
 gnome-desktop4-devel
 libxkbcommon-devel
 gtk4-devel
 iso-codes-devel
"

URI_gnome-desktop3-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gnome-desktop3-tests-44.0-18.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-desktop3-tests = "
 gnome-desktop3
 cairo
 glib2
 gtk3
 glibc
"
