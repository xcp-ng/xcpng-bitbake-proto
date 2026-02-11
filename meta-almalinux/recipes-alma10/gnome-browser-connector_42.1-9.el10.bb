
PN = "gnome-browser-connector"
PE = "0"
PV = "42.1"
PR = "9.el10"
PACKAGES = "gnome-browser-connector"


URI_gnome-browser-connector = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gnome-browser-connector-42.1-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gnome-browser-connector = "/usr/bin/python3 ( ) dbus ( ) hicolor-icon-theme ( ) python3-gobject-base ( ) gnome-shell ( ) mozilla-filesystem ( ) python(abi) ( =  3.12)"
RPROVIDES:gnome-browser-connector = "application() ( ) application(org.gnome.BrowserConnector.desktop) ( ) mimehandler(x-scheme-handler/gnome-extensions) ( ) gnome-browser-connector ( =  42.1-9.el10) gnome-browser-connector(x86-64) ( =  42.1-9.el10)"
