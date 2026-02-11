
PN = "gi-docgen"
PE = "0"
PV = "2023.3"
PR = "9.el10"
PACKAGES = "gi-docgen gi-docgen-doc gi-docgen-fonts"


URI_gi-docgen = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gi-docgen-2023.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:gi-docgen = "/usr/bin/pkg-config ( ) /usr/bin/python3 ( ) python3.12dist(packaging) ( ) python3.12dist(jinja2) ( ) python3.12dist(typogrify) ( ) python3.12dist(markupsafe) ( ) python3.12dist(pygments) ( ) python(abi) ( =  3.12) gi-docgen-fonts ( =  2023.3-9.el10) python3.12dist(markdown) ( >=  3.2)"
RPROVIDES:gi-docgen = "bundled(js-fzy) ( ) gi-docgen ( =  2023.3-9.el10) pkgconfig(gi-docgen) ( =  2023.3) python3.12dist(gi-docgen) ( =  2023.3) python3dist(gi-docgen) ( =  2023.3)"

URI_gi-docgen-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gi-docgen-doc-2023.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:gi-docgen-doc = ""
RPROVIDES:gi-docgen-doc = "gi-docgen-doc ( =  2023.3-9.el10)"

URI_gi-docgen-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gi-docgen-fonts-2023.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:gi-docgen-fonts = "font(redhatdisplay) ( ) font(redhatdisplayblack) ( ) font(redhatdisplaymedium) ( ) font(redhatmonovf) ( ) font(redhattext) ( ) font(redhattextmedium) ( )"
RPROVIDES:gi-docgen-fonts = "gi-docgen-fonts ( =  2023.3-9.el10)"
